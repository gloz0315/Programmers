select distinct(f.cart_id)
from (select *
from cart_products
where name = 'Milk') as f inner join
(select *
from cart_products
where name = 'Yogurt') as s on f.cart_id = s.cart_id 
order by 1