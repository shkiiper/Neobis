create table user
(
    userid     bigint       not null
        primary key,
    login         varchar(255) null,
    password varchar(255) null,
)
;

create table user_seq
(
    next_val bigint null
)
;
insert into user_seq values (1);