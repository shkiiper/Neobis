create table roles
(
    role_id bigint not null
        constraint roles_pkey
            primary key,
    name    varchar(255)
);
create table roles_seq
(
    next_val bigint null
)
;
insert into roles_seq values (1);