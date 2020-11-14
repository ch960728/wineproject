<!--u_id, user_name, id, pw, mail, tel, tendecy, sex, birth-->


select * from wine_member
delete from wine_member where u_id = 25
DROP TABLE wine_member
<!-- 사용자 테이블 -->
create table wine_member(
	u_id number(38) primary key,
	user_name varchar(100),
	id varchar(100) unique,
	pw varchar(100),
	mail varchar(100),
	tel varchar(100),
	tendency varchar(10),
	sex varchar(10),
	birth varchar(10),
	join_date date
)
<!--사용자 증가 함수 -->
 CREATE SEQUENCE member_seq

<!-- c_id, c_title, c_text, U-id(fk), date, c_count-->
 DROP TABLE community
 select * from community
create table community(
	c_id number(38) primary key,
	c_title varchar2(100),
	id varchar(100),
	c_text varchar(3000),
	c_img varchar(50) null,
	c_count number(38) null,
	c_date date,
	constraint emp_eno_fk foreign key (id) references wine_member (id)
)
<!--占쌉시깍옙 占쏙옙호 占싸울옙 -->
 CREATE SEQUENCE comm_seq

 
  DROP TABLE c_reply
  select * from c_reply
<!--커뮤니티 댓글 -->
create table c_reply(
	rc_id number(38) primary key,
	id varchar(100),
	c_id number(38),
	rc_text varchar(1000),
	rc_date date,
	constraint reply_eno_fk foreign key (id) references wine_member (id),
	constraint reply_rc_fk foreign key (c_id) references community (c_id)
)

delete from c_reply where rc_id = 25


<!--占쌉시깍옙 占쏙옙占� 占쏙옙호 占싸울옙 -->
 CREATE SEQUENCE rcomm_seq

