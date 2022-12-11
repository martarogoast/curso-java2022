//Buscar enlaces
var links = document.getElementsByTagName("a");
var num_list = links.length;
alert("Hay " + num_list + " enlaces");

//Dirección del último enlace
alert("Dirección del último enlace " + links.item(num_list-1).href);

//Número de párrafos
var parrafos = document.getElementsByTagName("p");
alert("Hay " + document.getElementsByTagName("p").length + " párrafos");

//Añadir párrafo nuevo
var parrafo = document.createElement("p");
var contenido = document.createTextNode("Ejercicio 8 de Javascript");
parrafo.appendChild(contenido);
document.body.appendChild(parrafo);