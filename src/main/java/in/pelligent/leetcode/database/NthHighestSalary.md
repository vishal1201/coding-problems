# Nth Highest Salary
## Intuition
Use LIMIT 1 OFFSET N in the Select clause and order records by salary, descending.

## Approach
1. Use 2 selects - 1 to select max(salary), one to select the selected max salary. This wraps the answer if it is null.
2. In 2nd select - Select distinct salary, order by salary desc, then use limit 1 and offset n.
3. Offset N applies limit after N elements; this for us get us the nth highest as we are ordering records in decreasing order.

## Code
```sql
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N=N-1;
  RETURN (
      
      SELECT (
          SELECT DISTINCT Salary FROM Employee
          ORDER BY Salary DESC
          LIMIT 1 offset N
      )
  );
END
```