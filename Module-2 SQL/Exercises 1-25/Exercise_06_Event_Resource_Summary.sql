USE event_portal;


SELECT e.title,
SUM(r.resource_type='pdf') pdf_count,
SUM(r.resource_type='image') image_count,
SUM(r.resource_type='link') link_count
FROM Events e
LEFT JOIN Resources r
ON e.event_id=r.event_id
GROUP BY e.event_id,e.title;
