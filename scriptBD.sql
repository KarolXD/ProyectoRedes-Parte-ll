create database dbproyectoredes1;
use dbproyectoredes1;
create table persona(
personaid int auto_increment primary key,
personacedula varchar(40),
personaclave varchar(40)
);

DELIMITER $$
CREATE PROCEDURE `login`(IN nombre varchar(40),IN contra varchar(40)) begin
select personacedula,personaclave from persona where personacedula=nombre and personaclave=contra
end;

DELIMITER $$
CREATE  PROCEDURE `registrarCliente`(IN usuario varchar(40), IN clave varchar(40))
begin
	insert into persona (personacedula,personaclave) values(usuario,clave);
    end