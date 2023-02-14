# Duplicate Emails

## Intuition
Use Group By, Having, Count clauses.

## Approach
select email from person, group by email column and add having clause with count(email) > 1.

## Code
```sql
SELECT email FROM person GROUP BY email HAVING COUNT(email) > 1;
```