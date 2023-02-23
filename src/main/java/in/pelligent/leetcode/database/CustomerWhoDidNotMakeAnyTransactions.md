# Customer who did not make any transactions

## Intuition
use `not exists` clause to discard the visits that exist in the transactions table.
Rest select the required columns are requested.

## Approach
1. select `customer_id`, `count(visit_id)` from visits
2. add `WHERE NOT EXISTS` clause to discard visits which exist in transactions table
3. group by `customer_id`

## Code
```sql
SELECT v.customer_id ,count(v.visit_id) AS count_no_trans
FROM visits v
WHERE NOT EXISTS (SELECT *
                  FROM transactions t
                  WHERE v.visit_id=t.visit_id)
GROUP BY v.customer_id;
```