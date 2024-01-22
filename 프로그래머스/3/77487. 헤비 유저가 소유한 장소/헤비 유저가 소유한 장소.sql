select f.id, f.name, f.host_id
from places as f right join 
(select host_id, count(host_id) as "id"
from places
group by host_id)
as s on f.host_id = s.host_id
where s.id >= 2
order by f.id