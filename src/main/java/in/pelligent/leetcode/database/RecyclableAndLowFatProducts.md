# Low Fats and Recyclable Products

## Intuition
Use `WHERE` clause with equality operator.

# Approach
1. select `product_id` from `products`.
2. add `WHERE` clause for `low_fats = 'Y' AND recyclable = 'Y'`

# Code
```sql
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
```