let dni_numero = prompt("Introduzca el número de su dni (sin letra)");
if (isNaN(dni_numero)){
    alert("Solo debe de introducir la parte numérica del DNI");
    location.reload();
} else if (dni_numero<1 || dni_numero>99999999 || dni_numero == ""){
    alert("Número no válido");
} else {
    let dni_letra = prompt("Introduzca la letra de su DNI");
    let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
    let letra_esperada = letras[dni_numero % 23];
    if (letra_esperada.toLowerCase() == dni_letra.toLowerCase()){
        alert("El DNI es correcto");
    } else {
        alert("La letra no es correcta");
    }
}


