CREATE TABLE Universidad (
    
    cod_uni varchar(25) PRIMARY KEY NOT NULL,
    nombre_uni varchar(25) NOT null,
    ciudad varchar(25) not null
    
);

CREATE TABLE Empleado (
    
    cod_emp varchar(25) PRIMARY KEY NOT NULL,
    nombre_empleado varchar(25) NOT null,
    calle varchar(25) not null,
    ciudad varchar(25) not null
    
);

CREATE TABLE Jefe (
    
    cod_jefe varchar(25) PRIMARY KEY NOT NULL,
    cod_emp varchar(25) NOT null,
    FOREIGN KEY ( cod_emp ) REFERENCES empleado(cod_emp)  

);

CREATE TABLE Trabaja (
    
    cod_uni varchar(25)  NOT NULL,
    cod_emp varchar(25) NOT null,
    sueldo_mensual int NOT null,
    FOREIGN KEY ( cod_emp ) REFERENCES empleado(cod_emp),  
    FOREIGN KEY ( cod_uni ) REFERENCES universidad(cod_uni)  

);

 insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('1','Manuela Alvarado','Cll 23','Bogota');

insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('2','Andres Gutierrez','Cll 45','Bogota');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('3','Carlos Avella','Cll 26a','Medellin');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('4','Jesus Jimenez','Cra 78','Manizales');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('5','Rafael Palacios','Tv 49','Bogota');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('6','Ramon Angarita','Cll 72','Arauca');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('7','Laura Santamaria','AC 30','San Andres');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('8','Sarah Arteaga','Cra 53','Manizales');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('9','Manuela Perez','Cra 68','Bogota');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('10','Daniela Triana','Cll 170','Chia');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('11','Nicolle Romero','Cll 222','Bogota');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('12','David Rodriguez','AK 57','San Andres');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('13','Felipe Villanueva','Cll 22sur','Arauca');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('14','Tomas Acuña','DG 46','Chia');
 
  insert into empleado (cod_emp,nombre_empleado,calle,ciudad)
 values ('15','Santiago Casabuenas','AK 9','Medellin');
 


insert into universidad (cod_uni,nombre_uni,ciudad)
values ('1','Universidad Central','Bogota');

 insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('2','Universidad de los andes','Bogota');
 
  insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('3','Universidad Nacional','Bogota');
 
   insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('4','Universidad Nacional','Medellin');
 
   insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('5','Universidad Nacional','Manizales');
 
   insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('6','Universidad Nacional','San Andres');
 
   insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('7','Universidad Nacional','Arauca');
 
   insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('8','Universidad el Bosque','Bogota');
 
   insert into universidad (cod_uni,nombre_uni,ciudad)
 values ('9','Universidad el Bosque','Chia');
 


 insert into jefe (cod_emp,cod_jefe)
 values ('4','1');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('6','2');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('8','3');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('10','4');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('14','5');

 insert into jefe (cod_emp,cod_jefe)
 values ('15','6');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('7','7');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('11','8');
 
  insert into jefe (cod_emp,cod_jefe)
 values ('13','9');



 insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('1','1',3700000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('2','8',5700000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('3','4',4000000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('4','5',13000000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('5','3',9000000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('6','7',16230000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('7','6',10450000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('8','5',12000000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('9','2',11000000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('10','9',11200000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('11','2',7800000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('12','6',4200000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('13','7',7500000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('14','9',18000000);
 
  insert into trabaja (cod_emp,cod_uni,sueldo_mensual)
 values ('15','4',12000000);