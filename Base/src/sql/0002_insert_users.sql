--//

Insert into FAM_USERS (USERID,EMAIL,FIRSTNAME,LASTNAME) values (1,'aneesh@aneesh.com','aneesh','kumar');


--//@UNDO

delete from FAM_USERS where USERID=1;