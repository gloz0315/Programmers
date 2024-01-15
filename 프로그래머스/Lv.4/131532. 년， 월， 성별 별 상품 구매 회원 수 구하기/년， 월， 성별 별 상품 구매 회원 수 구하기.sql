SELECT YEAR(o.sales_date) AS "YEAR",
       MONTH(o.sales_date) AS "MONTH",
       u.gender AS "GENDER",
       COUNT(DISTINCT(u.user_id)) as "USERS"
FROM online_sale as o left join user_info as u on o.user_id = u.user_id
WHERE u.gender is not null
GROUP BY 1,2,3
ORDER BY 1,2,3