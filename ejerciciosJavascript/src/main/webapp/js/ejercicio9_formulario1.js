function validar(){
    //Parte 1 - Comprobar que haya una provincia seleccionada
    var provincia = document.getElementById("prov");
    if (provincia.selectedIndex == ""){
        alert("Seleccione una provincia");
        return false;
    }
    
    //Parte 2 - Comprobar que la fecha sea válida
    var dia = document.getElementById("dia");
    var mes = document.getElementById("mes");
    var anyo = document.getElementById("anyo");

    //Comprobamos que haya introducido un día
    if (dia.value == null || isNaN(dia.value) || dia.value == "" ){
        alert("Introduzca un día");
    } else if (Number(dia.value) > 31 || Number(dia.value)<1 ){
        alert("Introduzca un valor válido de día");
        return false;
    } 

    //Comprobamos que haya seleccionado un mes
    if (mes.selectedIndex == ""){
        alert("Seleccione un mes");
        return false;
    }

    //Comprobamos que el año de nacimiento sea de una persona en edad de trabajar 
    //Entre cerca de cumplir los 16 años y los 80 años
    if (anyo.value == null || isNaN(anyo.value) || anyo.value == "" ){
        alert("Introduzca un año");
    } else if (Number(anyo.value) > (new Date().getFullYear() - 16)){
        alert("Usted es demasiado joven para trabajar");
        return false;
    } else if (Number(anyo.value)<(new Date().getFullYear() - 80)){
        alert("Disfrute de su jubilación");
        return false;
    } 

    //Comprobamos que sea una fecha correcta (meses con menos de 31 días)
    if (((mes.selectedIndex == "04")||(mes.selectedIndex == "06")||
        (mes.selectedIndex == "09")||(mes.selectedIndex == "11")) && (dia.value == "31")){
            alert("Ese mes no tiene 31 días \nReintroduzca la fecha");
            return false;
        }
    else if ((mes.selectedIndex == "02") && (dia.value>28)){
        if (dia.value>29){
            alert("Febrero no tiene tantos días \nReintoduzca la fecha");
            return false;
        } else{
            //Comprobamos si fue año bisiesto
            if ((anyo.value % 4) != 0){
                alert("Ese año no fue bisiesto. \nReintroduzca la fecha");
                return false;
            }
        }
    }

    return true;
}