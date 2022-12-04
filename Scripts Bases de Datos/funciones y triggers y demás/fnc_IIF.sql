CREATE DEFINER=`root`@`localhost` FUNCTION `fnc_IIF`(p1 boolean, p2 varchar(40), p3 varchar(40)) RETURNS varchar(40) CHARSET utf8mb4
BEGIN
	IF p1=true THEN RETURN p2;
    ELSE RETURN p3;
    END IF;
RETURN 1;
END