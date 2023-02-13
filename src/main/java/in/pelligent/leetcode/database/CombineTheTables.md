# Combine Two Tables

## Intuition
Left Join Person with Address on personId and select the required columns.

# Approach
1. select the necessary columns using the source tables are references. For example, `firstName` attribute exists in `person` table which is abrreviated as `p`. So we can refer/select `firstName` as `p.firstName`.
2. Do the above step for all necesaary attributes.
3. Put `person` table in first select clause.
4. Put `address` table in the LEFT JOIN clause.
5. Add `personId` column in ON clause.

# Code
```sql
SELECT p.firstName, p.lastName, a.city, a.state
FROM person p
LEFT JOIN address a
ON
    p.personId = a.personId;
```