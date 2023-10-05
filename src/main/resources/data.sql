create table cart (id integer not null, order_date timestamp not null, primary key (id));
create table cartitem (order_item_id integer not null, quantity integer not null, id integer, product_id integer, primary key (order_item_id));
create table customer (id integer not null, first_name varchar(255) not null, last_name varchar(255) not null, primary key (id));
create table product (product_id integer not null, price numeric(19,2) not null, product_description varchar(255) not null, product_name varchar(255) not null, primary key (product_id));
create sequence hibernate_sequence start with 1 increment by 1;
alter table cartitem add constraint FKcpdedmf8lj399judxai6pq8m2 foreign key (id) references cart;
alter table cartitem add constraint FK1h6e1eb88o4qyku4y34inyr72 foreign key (product_id) references product;

insert into customer (ID, FIRST_NAME, LAST_NAME) values (1, 'Alex', 'john');
insert into customer (ID, FIRST_NAME, LAST_NAME) values (2, 'Helix', 'Don');

commit;