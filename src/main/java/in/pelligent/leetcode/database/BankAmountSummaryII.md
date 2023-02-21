# Bank Account Summary II

## Intuition
Use `!=` and `IS NULL` conditional checks to discard records that do not have refree_id as 2
and include ones that have referee_id as `NULL`.

# Approach
1. SELECT `name` from `customers`.
2. add `IS NULL` clause for `referee_id` as well as `refere_id != 2`.

# Code
```sql
SELECT name FROM customer
WHERE referee_id IS NULL OR referee_id != 2;
```