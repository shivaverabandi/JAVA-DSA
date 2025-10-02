# Write your MySQL query statement below
select en.unique_id , e.name 
from employees as e left join employeeuni as en 
on e.id = en.id ; 