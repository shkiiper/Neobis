create table price_list
(
    price_id bigint not null
        constraint price_list_pkey
            primary key,
    price    double precision
);
create table pricelist_seq
(
    next_val bigint null
)
;
insert into pricelist_seq values (1);