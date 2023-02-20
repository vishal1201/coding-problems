# Employees Earning More Than their Managers

## Intuition
SELF JOIN on 2 entities - employees as employees and employees as manager, on managerId & id, with salary condition

## Approach
1. SELECT employee name from employee emp.
2. Self Join on employee manager
3. choose managerid = id in the `ON` clause.
4. put in the where clause - emp.salary > manager.salary.

## Code
```sql
SELECT emp.name as Employee FROM employee emp
JOIN employee mngr
ON
    emp.managerId = mngr.id
WHERE
    emp.salary > mngr.salary;
```