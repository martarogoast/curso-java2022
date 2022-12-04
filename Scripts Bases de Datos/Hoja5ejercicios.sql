use capgemini_arg;
SET GLOBAL log_bin_trust_function_creators = 1;
/*Ejercicio 1*/
select fnc_sumar(2,-3);
/*---------------------------------------------------------------------------------------*/
/*Ejercicio 2*/
/*	p1 debe de ser booleano porque tiene de valores true y false
	p2 y p3 deben de ser del mismo tipo y es ese es el tipo que retorna la función
    En este caso he elegido que sea un varchar(40) pero podría ser otro*/
select fnc_IIF(false, 'Verdadero', 'Falso');
/*---------------------------------------------------------------------------------------*/
/*Ejercicio 3*/
