# Find Total Time Spent By Each Employee

## Intuition
Use `GROUP BY` and `SUM` together to sum `out_time - in_time` per `emp_id`.

# Approach
1. select `event_day` AS `day`, `emp_id`
2. select `sum(out_time - in_time)`. This sums all the entries per employee and out - in gives us the total minutes spent.
3. use `GROUP BY` with emp_id, event_day.

# Code
```sql
SELECT event_day AS day,
emp_id, sum(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id; 
```