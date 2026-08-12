select e.name as Employee
from employee as e 
join employee as m
on e.managerId = m.id 
and e.salary > m.salary