select h.flavor
from first_half as h left join icecream_info as i on h.flavor = i.flavor
where i.ingredient_type like 'fruit%'
group by h.flavor
having sum(h.total_order) > 3000
order by sum(h.total_order) desc