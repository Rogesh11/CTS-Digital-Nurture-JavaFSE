USE event_portal;


SELECT registration_date,
COUNT(*) total_users
FROM Users
WHERE registration_date>=CURDATE()-INTERVAL 7 DAY
GROUP BY registration_date;
