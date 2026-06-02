USE event_portal;

    
SELECT u.full_name,
e.status,
COUNT(*) total_events
FROM Events e
JOIN Users u
ON e.organizer_id=u.user_id
GROUP BY u.full_name,e.status;
