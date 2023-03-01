# Rearrange Products Table

## Intuition
Use union to join 3 queries where each query is selecting product_id, price as store value and store_name as store1, 2 or 3.

# Approach
1. Build the following query -
   1. select `product_id`.
   2. add store_name column - 'store1' as store OR 'store2' as store
   3. select store1 or store2 as price
2. Do this for all 3 stores.
3. Join these 3 queries using `UNION`.

# Code
```sql
select product_id,'store1' as store,store1 as price from Products
where store1 is not null

union

select product_id,'store2' as store,store2 as price from Products
where store2 is not null

union

select product_id,'store3' as store,store3 as price from Products
where store3 is not null;
```