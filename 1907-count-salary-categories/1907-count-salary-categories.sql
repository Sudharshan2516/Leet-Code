# Write your MySQL query statement below
select 'Low Salary' as  category,
    sum(income < 20000 ) as accounts_count
from accounts
Union all
select 'Average Salary' ,
    sum(income Between 20000  and 50000 ) 
from accounts
union all
select 'High Salary',
    sum(income > 50000 ) 
from accounts