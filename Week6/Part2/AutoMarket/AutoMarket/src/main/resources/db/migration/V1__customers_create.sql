create table customer
(
    customerid     bigint       not null
        primary key,
    addres         varchar(255) null,
    customers_name varchar(255) null,
    email          varchar(255) null,
    phone_number   varchar(255) null
)
;

create table customer_seq
(
    next_val bigint null
)
;
insert into customer_seq values (1);