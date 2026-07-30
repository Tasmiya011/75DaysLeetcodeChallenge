# Write your MySQL query statement below
SELECT f.name
FROM Employee e
JOIN Employee f 
ON e.managerId = f.id
GROUP BY e.managerId 
HAVING COUNT(*) >= 5;