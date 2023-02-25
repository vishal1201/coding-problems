# Market Analysis I
## Intuition
Left join users on orders, sum order-ids and group by user

## Approach
1. SELECT `u.user_id as buyer_id`, `u.join_date`, `count(o.order_id) as 'orders_in_2019'` FROM `users`.
2. Left Join this on `orders`.
3. Do this on `o.buyer_id = u.user_id` AND `YEAR(order_date)='2019'`.
4. GROUP BY `user_id`.

## Code
```sql
SELECT u.user_id as buyer_id, u.join_date, count(o.order_id) as 'orders_in_2019'
FROM
    users u
LEFT JOIN
    Orders o
ON
    o.buyer_id=u.user_id
    AND YEAR(order_date)='2019'
GROUP BY u.user_id;
```