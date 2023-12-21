# Write your MySQL query statement below
 select e.unique_id as unique_id, en.name as name from Employees en LEFT JOIN EmployeeUNI e on e.id=en.id;