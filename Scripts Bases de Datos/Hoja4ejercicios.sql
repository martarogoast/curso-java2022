use capgemini_arg;
SET GLOBAL log_bin_trust_function_creators = 1;

/*Hoja 4*/
/*Ejercicio 1*/
/*Buscamos el sueldo del primero en entrar al departamento*/
select SALARY 
from employees 
where HIRE_DATE =	(SELECT MIN(HIRE_DATE) 
					FROM employees e, departments d
					WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID AND d.DEPARTMENT_NAME = 'IT');

/*Buscamos a Kimberely*/
select * 
from employees e 
where e.FIRST_NAME = 'Kimberely' AND e.LAST_NAME = 'Grant';

/*Obtener departamnto*/
select departments.DEPARTMENT_ID 
from departments 
where DEPARTMENT_NAME = 'IT';

/*Update Kimberely*/
/*update employees 
	set 	SALARY = (	select SALARY 
						from employees 
						where HIRE_DATE =
							(SELECT MIN(HIRE_DATE) FROM employees e, departments d
							WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID AND d.DEPARTMENT_NAME = 'IT')),
		DEPARTMENT_ID = (select departments.DEPARTMENT_ID from departments where DEPARTMENT_NAME = 'IT')
WHERE FIRST_NAME = 'Kimberely' AND LAST_NAME = 'Grant';*/
update employees 
set 	SALARY = 9000,
			DEPARTMENT_ID = 60
WHERE FIRST_NAME = 'Kimberely' AND LAST_NAME = 'Grant';
COMMIT;
/*---------------------------------------------------------------------------------------*/
/* Ejercicio 2 */
INSERT INTO countries (country_id, country_name, region_id)
			VALUES ('AR', 'Argentina', 2);
INSERT INTO locations 	(location_id, street_address, postal_code, city, state_province, country_id)
			VALUES		(9999, 'Manuela Pedraza','1429', 'Buenos Aires', 'Buenos Aires', 'AR');	
/*---------------------------------------------------------------------------------------*/
/* Ejercicio 3 */
UPDATE 	departments
SET		location_id = 9999
WHERE	department_name = 'IT';
COMMIT;
/*---------------------------------------------------------------------------------------*/
/* Ejercicio 4 */
/*Busco a quién borrar*/
SELECT employee_id, FIRST_NAME, LAST_NAME, l.COUNTRY_ID FROM employees e
INNER JOIN departments d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
INNER JOIN locations l ON d.LOCATION_ID = l.LOCATION_ID
WHERE l.COUNTRY_ID = 'CA';
 /*Eliminar los empleados que pertenezcan al departamento del país 'CA'*/
DELETE FROM employees
WHERE employee_id = 201;
DELETE FROM employees
WHERE employee_id = 202;
/*Buscar los departamentos de Canadá*/
SELECT l.COUNTRY_ID, l.LOCATION_ID FROM departments d 
INNER JOIN locations l ON d.LOCATION_ID = l.LOCATION_ID
WHERE l.COUNTRY_ID = 'CA';
/*Eliminar el registro correspondiente en la tabla Departments*/
DELETE FROM departments
WHERE location_id = 1800;
/*---------------------------------------------------------------------------------------*/
/* Ejercicio 5 */
/*Creamos consulta que devuelva lo que queremos añadir*/
SELECT DEPARTMENT_ID+200, concat(department_name, ' ', l.country_id), manager_id, l.location_id 
FROM departments d
INNER JOIN locations l on d.location_id = l.location_id;
/*Hacemos el insert*/
INSERT INTO departments (department_id, department_name, manager_id, location_id)
						SELECT DEPARTMENT_ID+200, concat(department_name, ' ', l.country_id), manager_id, l.location_id 
						FROM departments d
						INNER JOIN locations l on d.location_id = l.location_id;
COMMIT;
/*---------------------------------------------------------------------------------------*/
/* Ejercicio 6 */
/*No tengo ninguno que cumpla eso. Lo creo*/
INSERT INTO employees (employee_id, First_name, last_name, email, hire_date, job_id) 
VALUES (1,'Ejercicio 6','Hoja 4', 'ej6@hoja4.com', '1997-08-17','NEW_JOB');
/*Buscar a los que entraron el 17/8/1997*/
SELECT * FROM employees
WHERE hire_date = '1997-08-17';
/*Buscar el numero de trabajadores de los departamentos*/
SELECT department_id, count(DEPARTMENT_ID) FROM employees
GROUP BY department_id;
/*Modificar el número de departamento de los empleados que ingresaron el 17 de agosto de 1997 
a el obtenido anteriormente: 50*/
UPDATE employees 
SET department_id = 50
WHERE hire_date = '1997-08-17';

COMMIT;















