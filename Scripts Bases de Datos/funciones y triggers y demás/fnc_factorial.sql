CREATE DEFINER=`root`@`localhost` FUNCTION `fnc_factorial`(numero integer) RETURNS int
BEGIN
DECLARE fact integer;
DECLARE i integer;
SET fact = 1;
SET i = numero;
WHILE i>1 DO
	SET fact = fact * i;
    SET i = i-1;
END WHILE;
RETURN fact;
END