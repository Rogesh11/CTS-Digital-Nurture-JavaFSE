USE event_portal;


SELECT e.title,
COUNT(s.session_id) total_sessions
FROM Events e
JOIN Sessions s
ON e.event_id=s.event_id
GROUP BY e.event_id,e.title
HAVING COUNT(s.session_id)=(
SELECT MAX(cnt)
FROM(
SELECT COUNT(*) cnt
FROM Sessions
GROUP BY event_id
)x
);
