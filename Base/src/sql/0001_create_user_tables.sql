--//

create table FAM_USERS (
		USERID			varchar2(40 CHAR) NOT null,
		USERNAME 		varchar2(45 CHAR) NOT null,
	  	PASSWORD 		varchar2(45 CHAR) NOT null,
	  	EMAIL 			varchar2(45 CHAR) NOT null,
	  	FIRSTNAME 		varchar2(45 CHAR) null,
	  	LASTNAME 		varchar2(45 CHAR) null,
		constraint 		fam_users_p primary key (user_id)
	);

--//@UNDO

drop table fam_user

--//