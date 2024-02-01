select f.author_id,s.author_name,f.category,sum(t.sales * f.price) as "total_sales"
from book as f join author as s on f.author_id = s.author_id
          join book_sales as t on f.book_id = t.book_id
where t.sales_date like '2022-01%'
group by s.author_id,s.author_name, f.category
order by 1, 3 desc;