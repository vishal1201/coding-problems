# Patients with a Condition
## Intuition
Like Clause with `%` regex matcher.

## Approach
select everything from patients and using where clause on 2 conditions.
1. `LIKE` clause with `% DIAB1%`. This helps us select records where DIAB1 occurs as second condition. NOTE: Conditions are seperated by a space.
2. `LIKE` clause with `DIAB1%`. This selects all records that have DIAB1 as first condition.

## Code
```sql
SELECT * FROM patients WHERE conditions LIKE '% DIAB1%' OR conditions LIKE 'DIAB1%';
```