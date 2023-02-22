# Customers who never order

## Intuition
Left Join `customers` with `orders` on `customerid` where `customerid` is absent in `orders`.

# Approach
1. Select `name` from `customers`.
2. Left join `orders` on `customerId`.
3. Add `customerId is NULL` in `where`.

# Code
```sql
SELECT name as Customers
FROM Customers c
LEFT JOIN Orders AS o
ON
    o.customerID = c.id
WHERE
    o.customerID IS NULL;
```