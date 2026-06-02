USE event_portal;

SELECT e.title,
COUNT(r.registration_id) registrations
FROM Events e
JOIN Registrations r
ON e.event_id=r.event_id
GROUP BY e.event_id,e.title
ORDER BY registrations DESC
LIMIT 3;
