/*hoja 3 ejercicios*/
USE capgemini_arg;
/*Ejercicio 1 */
/* Forma 1 */
SELECT first_name, last_name, department_name, location_id 
FROM employees e, departments d
WHERE e.DEPARTMENT_ID=d.DEPARTMENT_ID and e.MANAGER_ID = 149;
/* Forma 2 */
SELECT first_name, last_name, DEPARTMENT_NAME, LOCATION_ID FROM employees AS e 
JOIN departments AS d ON e.MANAGER_ID = d.MANAGER_ID
WHERE e.MANAGER_ID = 149;
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 2*/
SELECT first_name, last_name, department_name, city FROM employees e, departments d, locations l
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID AND d.LOCATION_ID = l.LOCATION_ID ;
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 3*/
/*La pedida por el enunciado que da error porque el Reino Unido no se almacena como UK*/
SELECT e.LAST_NAME, d.DEPARTMENT_NAME, l.LOCATION_ID, l.CITY
FROM employees e, departments d, locations l, countries c
WHERE 	e.DEPARTMENT_ID = d.DEPARTMENT_ID AND d.LOCATION_ID = l.LOCATION_ID 
		AND l.COUNTRY_ID = c.COUNTRY_ID  AND c.COUNTRY_NAME = 'UK' AND e.COMMISSION_PCT>0;
/*La que devuelve de verdad a los que trabajan en UK pero no hay nadie que cobre comisión así que retorna 0 filas*/
SELECT e.LAST_NAME, d.DEPARTMENT_NAME, l.LOCATION_ID, l.CITY
FROM employees e, departments d, locations l, countries c
WHERE e.DEPARTMENT_ID = d.DEPARTMENT_ID AND d.LOCATION_ID = l.LOCATION_ID AND l.COUNTRY_ID = c.COUNTRY_ID  AND
c.COUNTRY_NAME = 'United Kingdom' AND e.COMMISSION_PCT>0;
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 4*/
SELECT concat(empl.first_name, ' ', empl.last_name, ' es empleado de ',
	man.first_name, ' ', man.last_name, '.') AS Empleados 
    FROM employees empl, employees man
    WHERE empl.manager_id = man.EMPLOYEE_ID;
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 5*/
/*No hay ninguna ciudad sin departamentos así que creo una*/
INSERT INTO locations (location_id, city, country_id) VALUES(250, 'Madrid', 'ES');

SELECT l.city, d.department_name FROM departments d 
RIGHT JOIN locations l ON d.location_id = l.location_id;
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 6*/
SELECT concat(empl.first_name, ' ', empl.last_name, ' es empleado de ',
	ifnull(man.first_name, 'la empresa.'), ' ', ifnull(man.last_name, ' No tiene manager'), '.') AS Empleados 
    FROM employees empl 
    LEFT JOIN employees man  ON empl.manager_id = man.EMPLOYEE_ID;
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 7*/
/*Elabora una consulta que despliegue el nombre y el apellido del empleado,la fecha de contratación , 
la fecha de la primer revisión salarial que fue a los seis meses de haber sido contratado, 
su primer día viernes en la empresa para los empleados del departamento de Marketing.*/
SELECT first_name, last_name, hire_date FROM employees;
/*TODO*/
/*---------------------------------------------------------------------------------------*/   
/*Ejercicio 8*/
/* Forma 1 - ANY */
SELECT e.last_name, e.salary, d.department_name FROM employees e
INNER JOIN  departments d ON e.department_id = d.department_id
WHERE salary <= ANY (SELECT Min(salary) FROM employees e2
					WHERE e2.department_id = e.department_id);
/* Forma 2 - IN */
SELECT e.last_name, e.salary, d.department_name FROM employees e
INNER JOIN  departments d ON e.department_id = d.department_id
WHERE salary IN (SELECT MIN(salary) FROM employees e2
					WHERE e2.department_id = e.department_id);
/* Forma 3 - Extra: con ALL */
SELECT e.last_name, e.salary, d.department_name FROM employees e
INNER JOIN  departments d ON e.department_id = d.department_id
WHERE salary <= ALL (SELECT salary FROM employees e2
					WHERE e2.department_id = e.department_id);
/*---------------------------------------------------------------------------------------*/   
/* Ejercicio 9 */




SELECT * FROM Employees;
SELECT FIRST_NAME, LAST_NAME, MANAGER_ID, JOB_ID FROM employees;
DESC employees;
DESC countries;
DESC locations;




