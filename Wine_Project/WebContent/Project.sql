<!--u_id, user_name, id, pw, mail, tel, tendecy, sex, birth-->


select * from wine_member
delete from wine_member where u_id = 25
DROP TABLE wine_member
<!-- ��� ���̺�-->
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
<!--ȸ�� ��ȣ �ο� -->
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
<!--�Խñ� ��ȣ �ο� -->
 CREATE SEQUENCE comm_seq

 
  DROP TABLE c_reply
  select * from c_reply
<!--�Խñ� ��ȣ �ο� -->
 create table c_reply(
	r_id number(38) primary key,
	id varchar(100),
	c_id numer(38),
	r_text varchar(1000),
	r_date date,
	constraint reply_eno_fk foreign key (id) references wine_member (id),

)
<!--�Խñ� ��� ��ȣ �ο� -->
 CREATE SEQUENCE rcomm_seq

