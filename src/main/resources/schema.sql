drop table if exists users;
create table users(userid bigserial, username varchar(255), password varchar(255), enabled boolean);
insert into users(username,password,enabled) values ('bengt', 'bengt', true), ('sune', 'sune', true), ('leif', 'leif', false);
drop table if exists user_roles;
create table user_roles(username varchar(255), role varchar(255), PRIMARY KEY(username, role));
insert into user_roles(username, role) values ('bengt','ROLE_USER'), ('sune', 'ROLE_ADMIN');
