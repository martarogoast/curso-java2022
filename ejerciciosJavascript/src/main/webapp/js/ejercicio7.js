
function isEven(num) {
    if (isNaN(num)){
        return ("Eso no es un número");
    } else if ((num % 2) == 0){
        return "El número "+num + " es par";
    } else {
        return "El número "+num + " es impar";
    }
}

alert(isEven(prompt("Introduzca un numero")));