select i.rest_id,
       i.rest_name,
       i.food_type,
       i.favorites,
       i.address,
       r.score
from rest_info as i 
inner join 
(select rest_id, round(avg(review_score),2) as "score"
from rest_review
group by rest_id) 
as r on i.rest_id = r.rest_id
where i.address like '서울%'
order by r.score desc, i.favorites desc