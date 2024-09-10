# Write your MySQL query statement below
SELECT firstname, lastname, city, State
FROM Person 
LEFT JOIN
Address
ON Person.personId = Address.PersonId;