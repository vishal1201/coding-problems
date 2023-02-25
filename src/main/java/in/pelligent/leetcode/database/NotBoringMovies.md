# Not Boring Movies
## Intuition
Use `WHERE` clause to filter records which are odd and description is not boring.

## Approach
1. `SELECT * FROM Cinema`
2. Add `WHERE` clause
3. Use this to select only odd-numbered records - `id % 2 == 0`.
4. Use this to select records that do not having description as boring - `description != 'boring'`
5. `ORDER BY rating DESC` to order records by rating in descending/decreasing order.

## Code
```sql
# Write your MySQL query statement below
SELECT * FROM Cinema
WHERE
    id % 2 != 0
    AND description != 'boring'
ORDER BY rating DESC;
```