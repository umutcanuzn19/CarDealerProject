create table dealer(id identity primary key,f_name varchar(50),l_name varchar(50),e_mail varchar(50));

create table car(id identity primary key,car_brand varchar(20),car_model varchar(20),car_code varchar(20),car_price varchar(20),car_case varchar(5),car_date varchar(20),dealer_id bigint,foreign key(dealer_id) references dealer(id));