insert into APP_USER(ID, PASSWORD, USERNAME) values(1, '$2a$10$m00NwpuW0h1lfJQ8Yim3j.ijnBbdmzKeqEFcRQ04SaAX1viRK1A7a', 'admin');
insert into USER_ROLE(APP_USER_ID, ROLE) values(1, 'ADMIN');
insert into USER_ROLE(APP_USER_ID, ROLE) values(1, 'PREMIUM_MEMBER');

insert into hero(id,name,secreto) values(1,'Black Widow',TRUE);
insert into hero(id,name,secreto) values(2,'Superman',TRUE);
insert into hero(id,name,secreto) values(3,'Rogue',FALSE);
insert into hero(id,name,secreto) values(4,'Batman',TRUE);