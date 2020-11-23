<!--u_id, user_name, id, pw, mail, tel, tendecy, sex, birth-->


select * from wine_member
delete from wine_member where u_id = 62
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
 
 <!-- 사용자 설문조사 테이블-->
 

 
DROP TABLE wine
 select * from wine
 <!-- wine 테이블 -->
 create table wine(
 	wine_id number(15),
 	w_name	varchar(200),
 	w_namee	varchar(200),
 	productk varchar(200),
 	producte varchar(200),
 	locationk varchar(200),
 	locatione varchar(200),
 	kind varchar(400),
 	kinds varchar(400),
 	use varchar(200),
 	alcohol varchar(40),
 	temper varchar(40),
 	grade varchar(50),
 	sugar varchar(5),
 	acidity	varchar(5),
 	body varchar(5),
 	tannin varchar(5),	
 	price varchar(10),
 	REMARK varchar(2000),
 	year varchar(5),
 	liter varchar(5),
 	fruit varchar(1),
 	flower varchar(1),
 	vegetable varchar(1),
 	spice varchar(1),
 	mineral varchar(1),
 	chemistry varchar(1),
 	animal varchar(1),
 	burnt varchar(1),
 	balsamic varchar(1),	
 	scent varchar(400),
 	menu varchar(1000),
 	img varchar(300)
 )
 
 alter table wine add primary key(wine_id)
 
 <!--와인 점수 및 댓글 테이블-->
 select * from wine_score
 delete from wine_score where wine_id = 62
 DROP TABLE wine_score
 create table wine_score(
 	wr_id number(38) primary key,
	u_id number(38),
	wine_id number(38),
	score number(10),
	rw_text varchar(1000),
	rw_date date,
	constraint user_score_fk foreign key (u_id) references wine_member (u_id),
	constraint user_score_fk2 foreign key (wine_id) references wine(wine_id)
)
  CREATE SEQUENCE wine_score_seq

<!-- c_id, c_title, c_text, U-id(fk), date, c_count-->
 DROP TABLE community
delete from community where id = 'test'
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

delete from c_reply where id = 'test'


<!--댓글 번호만들기 -->
 CREATE SEQUENCE rcomm_seq
 
 <!--Q&A테이블 -->
select * from qna
drop table qna
create table qna(
	q_id number(38) primary key,
	id varchar(100),
	q_text varchar2(2000),
	a_text varchar2(2000),
	q_date date,
	
	constraint qest_fk foreign key (id) references wine_member (id)
)

CREATE SEQUENCE q_seq