//Parte 4 - Avisar al usuario de que ha seleccionado un impuesto menor al 16%
var impuesto = document.getElementById("impuestos");
impuesto.addEventListener("change", function(){
    if ((Number)(impuesto.value)< 16 ){
        alert("Ha seleccionado un impuesto bajo");
    }});

//Parte 5 - Indicar que ha seleccionado la opción más indicada si es el 5%
var descuento = document.getElementById("promo_5");
descuento.addEventListener("click", function(){
    alert("Ha elegido la opción más indicada")});

function validar(){
    //Parte 1 - Comprobamos que haya puesto el nombre
    var nombre = document.getElementById("fnombre");
    if (nombre.value == null || nombre.value ==""){
        alert("Debe de introducir un nombre");
        return false;
    }

    //Parte 2 - Comprobamos que haya introducido el precio
    var precio = document.getElementById("fprecio");
    if (precio.value == null || precio.value =="" ){
        alert("Debe de introducir un precio");
        return false;
    } else if (isNaN(precio.value)){
        alert("El precio debe ser un número");
        return false;
    } else {
        //Parte 3 - Comprobamso que el precio sea mayor que 120 euros
        if ((Number)(precio.value) <= 120){
            alert("El precio debe de ser superor a 120€ \nReintroduzca el valor del producto")
            return false;
        }
    }
    return true;
}