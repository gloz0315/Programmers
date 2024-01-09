select user_id, product_id
from online_sale
group by 1,2
having count(product_id) >= 2
order by 1, 2 desc