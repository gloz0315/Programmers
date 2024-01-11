select no1.apnt_no,
       no1.pt_name,
       no1.pt_no,
       no1.mcdp_cd,
       no2.dr_name,
       no1.apnt_ymd
from
(select a.apnt_no,p.pt_name,a.pt_no,a.mcdp_cd,a.mddr_id,a.apnt_ymd
from appointment as a
     left join patient as p
     on a.pt_no = p.pt_no
where a.apnt_cncl_yn = 'N') as no1
left join 
(select dr_name,dr_id
 from doctor
) as no2 on no1.mddr_id = no2.dr_id
where no1.apnt_ymd like '2022-04-13%'
order by 6