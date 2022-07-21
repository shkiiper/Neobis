create table car_type
(
    car_type_id bigint not null
        constraint car_type_pkey
            primary key,
    car_type    varchar(255)
);
create table cartype_seq
(
    next_val bigint null
)
;
insert into cartype_seq values (1);