CREATE TABLE 	character_rickandmorty (ID 	NUMBER NOT NULL,
										NAME	VARCHAR2(200) NOT NULL,
										STATUS	VARCHAR2(5)	NOT NULL,
										SPECIE	VARCHAR2(200) NOT NULL,
										VCTYPE	VARCHAR2(100) NOT NULL,
										GENDER	VARCHAR2(50) NOT NULL,
										IMAGE	VARCHAR2(2000) NOT NULL,
										CREATED	DATE	NOT NULL DEFAULT SYSDATE);