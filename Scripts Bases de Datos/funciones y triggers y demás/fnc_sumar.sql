CREATE DEFINER=`root`@`localhost` FUNCTION `fnc_sumar`(a integer , b integer ) RETURNS int
BEGIN
	declare
    result integer;
    set result = a +b;
RETURN result;
END