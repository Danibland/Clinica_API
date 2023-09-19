create table medicos(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(100)not null unique,
    documento varchar(10) not null unique,
    especialidad varchar(100)not null,
    calle varchar(100)not null,
    ciudad varchar(100) not null,
    numero varchar(20),
    complemento varchar(100),
    primary key(id)

)