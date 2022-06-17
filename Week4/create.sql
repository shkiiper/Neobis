create database AutoSalon;

use AutoSalon;

create table Cars(
    ID int UNSIGNED  primary key auto_increment,
    CarName varchar(50) not null,
    Color varchar(50) not null,
	CarModel varchar(50) not null,
    EngineSize DOUBLE not null,
    Price DOUBLE not null
);


create table Customers(
    ID int UNSIGNED  primary key auto_increment,
    CustomersName varchar(50) not null,
    Addres varchar(50) not null,
    Email varchar(50) not null,
    Tel varchar(15) not null,
    unique(CustomersEmail, Tel)
);


create table Orders(
    ID int UNSIGNED  primary key auto_increment,
    CarID int unsigned,
    CustomersId int unsigned,
    DateOrder DATE,
	SumOrder int unsignet,
	status varchar(40) NOT NULL,
    foreign key (CustomersId) references Customers (CustomersId),
    foreign key (CarID) references Cars(CarID)
);