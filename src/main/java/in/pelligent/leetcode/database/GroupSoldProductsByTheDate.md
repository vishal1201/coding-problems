# Group Sold Products By The Date

## Intuition
using GROUP_CONCAT clause to group products, COUNT for counting occurences of sell_date for a certain product, along side filtering from distinct sell_date, product pairs.

## Approach
1. Select 3 things - `sell_date`, `num_sold` as `COUNT(sell_date)` which will serve as total sold products as it counts for sell_date occurences in the table, which have different products sold on a certain date; thirdly, select different products using the `GROUP_CONCAT` clause; it delimits the elements by comma, and groups the input value; here, DISTINCT Product.
2. For us to be able to group and count, we would need to use th `GROUP BY` clause. But since we are using 2 aggregations on 2 differnt columns, we will have to group by both. Hence, we group by DISTINCT sell_date, product.

## Code
```sql
SELECT  
	sell_date,
	(COUNT(sell_date)) as num_sold,
	GROUP_CONCAT(
        DISTINCT product ORDER BY product
    ) as products 
FROM 
	(
        SELECT DISTINCT sell_date,product FROM Activities
    ) as Activities
GROUP BY sell_date;
```