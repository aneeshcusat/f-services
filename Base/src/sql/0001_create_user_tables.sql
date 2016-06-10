--//

create table fam_user (
		user_id			varchar2(40 CHAR) NOT null,
		username 		varchar2(45 CHAR) NOT null,
	  	password 		varchar2(45 CHAR) NOT null,
	  	email 			varchar2(45 CHAR) NOT null,
	  	first_name 		varchar2(45 CHAR) null,
	  	last_name 		varchar2(45 CHAR) null,
		constraint 		fam_user_p primary key (user_id)
	);

--//@UNDO

drop table fam_user

--//