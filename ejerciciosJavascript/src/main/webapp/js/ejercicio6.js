let num = prompt('Introduzca un número');
if (num<0){
    alert("No se puede calcular el factorial de un número negativo");
} else if (parseFloat(num)==num || isNaN(num)){
    alert("Esta calculadora es para números enteros :)")
}
else  {
// Se ha tenido en cuenta que por convención 0! = 1
    let fact = 1;
    for (let i = num; i >1; i--) {
        fact = fact * i;
    }
    alert ('El factorial de ' + num + ' es ' + fact);
};
