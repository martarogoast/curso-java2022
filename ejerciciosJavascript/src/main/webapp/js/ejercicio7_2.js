function cases(str) {
    if (str == null || str == ""){
        alert('Está vacío');
    } else if (!isNaN(parseFloat(str))){
        alert("No hay mayúsculas ni minúsculas porque es un número");
    } else if (String(str) == String(str.toUpperCase()) ) {
        alert('Está en mayúsculas');
    } else if (String(str) == String(str.toLowerCase())){
        alert('Está en minúsculas');
    } else{
        alert('Hay mayúsculas y minúsculas');
    }
}
cases(prompt("Introduzca un texto"));
