# Second Highest Salary
## Intuition
Sub-select query. Inner select selects max salary, outer select select 2nd max by discarding the result that equals the 1st max.

## Approach
1. Write a select max(salary) from employee.
2. Add a `salary not in` clause.
3. Write a second/sub select statement that select's max from employee.

## Code
```sql
SELECT max(e.salary) as SecondHighestSalary FROM employee e
WHERE e.salary not in (
    SELECT max(e1.salary) FROM employee e1
);
```