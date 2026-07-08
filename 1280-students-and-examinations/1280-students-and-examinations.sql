# Write your MySQL query statement below
SELECT s.student_id, s.student_name, t.subject_name,
COUNT(e.student_id) AS attended_exams
FROM Students AS s
CROSS JOIN Subjects AS t
LEFT JOIN Examinations AS e
ON s.student_id = e.student_id
AND t.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, t.subject_name
ORDER BY s.Student_id, t.subject_name;