select u.user_id, u.nickname, u.address as "전체주소", u.tlno as "전화번호"
from used_goods_board as b
     left join (
         select user_id as "user_id",
                nickname as "nickname",
                concat(city,' ',street_address1,' ',street_address2) as "address",
                concat(substr(tlno,1,3),'-',substr(tlno,4,4),'-',substr(tlno,8)) as "tlno"
         from used_goods_user
     ) as u on b.writer_id = u.user_id
group by b.writer_id
having count(writer_id) >= 3
order by 1 desc