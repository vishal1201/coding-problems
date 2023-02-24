# Swap Salary

## Intuition
Use `UPDATE` with `CASE`

## Approach
1. Update `Salary`
2. set `sex`
3. use case to set 'm' if sex = 'f' else set it as 'f'.

## Code
```sql
UPDATE Salary 
SET sex = (
    CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END
);
```