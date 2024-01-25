select concat("/home/grep/src/",f.BOARD_ID,"/",f.FILE_ID,f.FILE_NAME,f.FILE_EXT) as "file_path"
FROM USED_GOODS_FILE AS f inner join
(
select * from used_goods_board
where views = (select max(views) from used_goods_board)
) as b
where f.BOARD_ID = b.BOARD_ID
order by f.file_id desc