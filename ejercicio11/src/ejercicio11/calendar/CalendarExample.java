package ejercicio11.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Ejercicio 11
 * El ejercicio pide por pantalla una fecha e imprime la hoja del calendario (con el domingo como primer dia de la semana) de ese mes con ese dia señalado con un asterisco.
 * @author Marta Rodriguez
 *
 */
public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		cal.set(1992, Calendar.SEPTEMBER, 7);
		
//		cal.add(Calendar.DATE, 9);	//Añado 10 dias
//		cal.add(Calendar.MONTH,2);	//Añado 2 meses
//		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy EEEEE");
		System.out.println("La fecha de hoy es: " + sdf.format(cal.getTime()));
//		
//		System.out.println("Datos a obtener: ");
//		System.out.println("Mi año de nacimiento es " + cal.get(Calendar.YEAR));
//		System.out.println("Mi mes de nacimiento es " + ((cal.get(Calendar.MONTH)+1)));
//		System.out.println("Mi dia de nacimiento es " + cal.get(Calendar.DATE));
//		System.out.println("He nacido en " + cal.get(Calendar.DAY_OF_WEEK));
//		
		System.out.println("Ingrese el año");
		Scanner sc = new Scanner(System.in);
		int anyo = sc.nextInt();
		System.out.println("Ingrese el mes");
		int mes = sc.nextInt();
		System.out.println("Ingrese el dia");
		int dia = sc.nextInt();
		
		calendarPrint(dia, mes, anyo);
//		calendarPrint(13, 2, 1972);
		
		sc.close();
	}
	
	public static void calendarPrint(int pdia, int pmes, int panyo) {
		//Fila de días
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
		//Dias que tiene el mes
		int diasMes= mesLength(pmes, panyo);
		
		//Primera fila del mes
		int espacios = getEspacios(pdia, pmes, panyo);
		for(int i = 1; i<espacios;i++) {
			System.out.print("\t");
		}
		
		//Imprimir el mes
		for (int i = 1; i <= diasMes; i++) {
            System.out.print(i); 				
            if (i==pdia) System.out.print("*");
            System.out.print("\t");
            if (((i + espacios - 1) % 7 == 0) || (i == diasMes)) 
            	System.out.println();
            
        }
	}

	/**
	 * Devuelve el numero de espacios que hay que insertar antes del primer dia del mes
	 * @param pdia Dia del mes del 1 en adelante
	 * @param pmes Mes del 1 al 12
	 * @param panyo Año
	 * @return int Numero de espacios
	 */
	private static int getEspacios(int pdia, int pmes, int panyo) {
		Calendar cal = Calendar.getInstance();
		cal.set(panyo, pmes-1, 1);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * Devuelve el numero de dias del mes
	 * @param mes Numero del mes del 1 al 12
	 * @param anyo Año
	 * @return Ultimo dia del año
	 */
	private static int mesLength(int mes, int anyo) {
		Calendar cal = Calendar.getInstance();
		cal.set(anyo, mes-1, 1);
		int dias = 1;
		
		while(cal.get(Calendar.MONTH)==(mes-1)) {
			dias = cal.get(Calendar.DATE);
			cal.add(Calendar.DATE, 1);
		}
		return dias;
	}

}