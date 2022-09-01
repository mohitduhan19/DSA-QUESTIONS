# Write your MySQL query statement below

# SELECT email
# FROM Person
# HAVING COUNT(email) > 1;

SELECT DISTINCT p1.email
FROM Person p1 JOIN Person p2 ON
p1.email = p2.email AND p1.id != p2.id