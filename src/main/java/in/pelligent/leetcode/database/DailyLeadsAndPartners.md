# Daily Leads and Partners

## Intuition
use count for aggregating `lead_id`, `partner_id` and `GROUP BY` the same columns.

# Approach
1. select `date_id`, `make_name`.
2. use `count` with `distinct lead_id`. do the same for `partner_id`.
3. group by `date_id, make_name`.

# Code
```sql
SELECT date_id, make_name, COUNT(DISTINCT lead_id) AS unique_leads, COUNT(DISTINCT partner_id) AS unique_partners
FROM DailySales
GROUP BY date_id, make_name;
```