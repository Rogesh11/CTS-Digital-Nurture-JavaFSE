USE event_portal;

SELECT YEAR(registration_date) year,
MONTH(registration_date) month,
COUNT(*) registrations
FROM Registrations
WHERE registration_date>=CURDATE()-INTERVAL 12 MONTH
GROUP BY YEAR(registration_date),
MONTH(registration_date)
ORDER BY year,month;
