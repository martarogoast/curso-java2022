use capgemini_arg;
/*Hoja 2*/
/*Ejercicio 1*/
/*Forma 1*/
select last_name, first_name, job_id, department_name from employees as emp
	inner join departments as dep 
	on emp.department_id = dep.department_id 
	where (commission_pct is null or commission_pct = 0) and 
	(salary between 7000 and 10000);

/*Forma 2*/
select last_name, first_name, job_id, department_name from employees as emp
	inner join departments as dep 
	on emp.department_id = dep.department_id 
	where (commission_pct is null or commission_pct = 0) and 
	(salary >= 7000) and 
    (salary<=10000);
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 2 */
SELECT first_name, last_name, job_id FROM employees
WHERE job_id = 'it_prog' OR job_id = 'st_man' OR job_id = 'pr_rep'  
ORDER BY job_id ASC;
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 3 */
SELECT first_name, last_name, job_id, salary, commission_pct, (salary+commission_pct) AS 'Total salary' 
FROM employees
WHERE first_name = 'Alberto';
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 4 */
SELECT department_id FROM employees ORDER BY department_id ASC;
SELECT DISTINCT employees.department_id, departments.department_name FROM employees 
INNER JOIN departments ON employees.department_id = departments.department_id
ORDER BY department_id ASC;
	/* 4.1)-Qué aparece en el último registro? department_id = 110 */
	/* 4.2)-Modificar la consulta para que aparezca en primer lugar:*/
SELECT DISTINCT employees.department_id, departments.department_name FROM employees 
INNER JOIN departments ON employees.department_id = departments.department_id
ORDER BY department_id DESC;
/* 4.3)-Reescribir la consulta para reemplazar el valor nulo por -1 */
SELECT DISTINCT ifnull(employees.department_id,-1) AS department_id, departments.department_name FROM employees 
INNER JOIN departments ON employees.department_id = departments.department_id
ORDER BY department_id DESC;
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 5 */
SELECT manager_id, last_name, job_id FROM employees
WHERE (job_id <> 'SA_REP' OR job_id <> 'AD_VP') AND (last_name LIKE 'k%' OR manager_id=100)
ORDER BY manager_id DESC, last_name ASC;
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 6 */
SELECT department_id, count(department_id) AS Employees_in_dpt FROM employees
WHERE department_id>=40
GROUP BY department_id
ORDER BY Employees_in_dpt DESC;
/*La diferencia entre el count(*) y el count(department_id) es que el primero incluye los valores null y el segundo no
En este caso, ambos devuelven el mismo número de filas porque no hay nadie con valor null en el department_id*/
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 7 */
SELECT country_id, count(location_id)  FROM locations
GROUP BY country_id;
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 8 */
SELECT ROUND(AVG(salary)) AS Average, MAX(salary) AS Maximum, MIN(salary) AS Minimum FROM employees
WHERE department_id = 110 OR department_id=20
GROUP BY department_id;
/* 8.1 - Las funciones ignoran los valores null para hacer sus cálculos*/
/* 8.2 - Se modifica el resultado ya que ahora se incluye el valor en la función*/
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 9 */
SELECT MAX(salary), MIN(salary), (MAX(salary)-MIN(salary)) AS DIFFERENCE FROM employees
GROUP BY job_id;
/*---------------------------------------------------------------------------------------*/    
/*Ejercicio 10 */
SELECT job_id, ROUND((salary/12),2) AS Salary_per_month FROM Employees
WHERE salary>13000 AND job_id NOT LIKE '%REP%'
ORDER BY Salary_per_month DESC;
/*---------------------------------------------------------------------------------------*/    
/* Ejercicio 11 */
SELECT first_name, count(first_name) AS Repeticiones FROM Employees
GROUP BY first_name;
/*---------------------------------------------------------------------------------------*/    
/* Ejercicio 12 */
SELECT AVG(salary) FROM employees 
GROUP BY department_id
HAVING AVG(salary) >= ALL (
						SELECT AVG(salary) FROM employees
						GROUP BY department_id);
    