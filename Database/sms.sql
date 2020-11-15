DROP DATABASE sms;

CREATE DATABASE sms;

USE sms;

CREATE TABLE student(sid VARCHAR(4) NOT NULL,
					sname VARCHAR(25) NOT NULL,
					dob DATE NOT NULL,
					age INT(3) NOT NULL,
					nic VARCHAR (12) NOT NULL,
					tel1 VARCHAR(15) NOT NULL,
					tel2 VARCHAR(15),
					address VARCHAR(30) NOT NULL
					CONSTRAINT PRIMARY KEY(sid));
					
						
CREATE TABLE course(cid VARCHAR(4) NOT NULL PRIMARY KEY,
					cname VARCHAR(20) NOT NULL,
					cfee DECIMAL(10,2) NOT NULL
					CONSTRAINT PRIMARY KEY(cid));
					
							
					
CREATE TABLE batch (bid VARCHAR(4) NOT NULL,
					bno int(4) NOT NULL,
					cid VARCHAR(4) NOT NULL,
					CONSTRAINT PRIMARY KEY(bid),
					FOREIGN KEY (cid) REFERENCES course(cid) ON DELETE CASCADE ON UPDATE CASCADE);

CREATE TABLE subject(sid VARCHAR(4) NOT NULL,
					 sname VARCHAR(20) NOT NULL
					 CONSTRAINT PRIMARY KEY(sid));
					
CREATE TABLE reg_detail(rid VARCHAR(8) NOT NULL,
						bid VARCHAR(4) NOT NULL,
						sid VARCHAR(4) NOT NULL,
						rfee DECIMAL(10,2) NOT NULL,
						reg_date DATE NOT NULL,
						CONSTRAINT PRIMARY KEY(rid),
						FOREIGN KEY (bid) REFERENCES batch(bid) ON DELETE CASCADE ON UPDATE CASCADE,
						FOREIGN KEY (sid) REFERENCES student(sid) ON DELETE CASCADE ON UPDATE CASCADE);
						
					
CREATE TABLE cs(csid VARCHAR(4) PRIMARY KEY,
				semester VARCHAR(20) NOT NULL,
				cid VARCHAR(4) NOT NULL ,
				sid VARCHAR(4) NOT NULL,
				CONSTRAINT PRIMARY KEY(csid,cid,sid),
				FOREIGN KEY (cid) REFERENCES course(cid) ON DELETE CASCADE ON UPDATE CASCADE,
				FOREIGN KEY (sid) REFERENCES subject(sid) ON DELETE CASCADE ON UPDATE CASCADE);
				
CREATE TABLE exam_detail(eid VARCHAR(4) PRIMARY KEY,
						edate DATE NOT NULL,
						marks INT(3) NOT NULL,
						rid VARCHAR(4),
						csid VARCHAR(4),
						CONSTRAINT PRIMARY KEY(eid),
						FOREIGN KEY (rid) REFERENCES reg_detail(rid) ON DELETE CASCADE ON UPDATE CASCADE,
						FOREIGN KEY (csid) REFERENCES cs(csid) ON DELETE CASCADE ON UPDATE CASCADE);
									
CREATE TABLE attendance(aid VARCHAR(4) PRIMARY KEY,
						rid VARCHAR(4) NOT NULL,
						csid VARCHAR(4) NOT NULL,
						date DATE NOT NULL,
						time DATETIME NOT NULL,
						CONSTRAINT PRIMARY KEY(aid),
						FOREIGN KEY (rid) REFERENCES reg_detail(rid) ON DELETE CASCADE ON UPDATE CASCADE,
						FOREIGN KEY (csid) REFERENCES cs(csid) ON DELETE CASCADE ON UPDATE CASCADE);
				
CREATE TABLE users(username varchar(20) NOT NULL,
				   password varchar(50) NOT NULL,
				   previlages varchar(20) not null
				   CONSTRAINT PRIMARY KEY(username));
				   
CREATE TABLE lectureshedule(lid VARCHAR(4) NOT NULL,
					  lname VARCHAR(30) NOT NULL,
					  lecture_name VARCHAR(30)NOT NULL
					  date DATETIME NOT NULL
					  CONSTRAINT PRIMARY KEY(lid));
					  
CREATE TABLE examshedule(esid VARCHAR(4) NOT NULL,
					 	 esname VARCHAR(30) NOT NULL,
					 	 date  DATETIME NOT NULL
						 CONSTRAINT PRIMARY KEY(esid));					   			