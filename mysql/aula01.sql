create database if not exists db_servico_hora;

use db_servico_hora;

create table if not exists funcionarios(
  id bigint NOT NULL AUTO_INCREMENT,
  nome char(255) NOT NULL,
  idade int,
  nascimento int,
  salario decimal,
  cargo char(255),
  PRIMARY KEY (id)  
);

insert into funcionarios(nome, idade, nascimento, salario, cargo) 
        values ("daniel", 27, 1911, 3000, "dev junior");

select * from funcionarios;

