package parte2;

import java.util.Scanner;

/**
 * Este programa pide un número de entradas en taquilla y le debe de devolver el
 * precio total de la suma de todas las entradas. Si ese precio supera los 100
 * euros, se aplica un descuento del 5%.
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedirle al usuario el número de entradas.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable entradasN como int para almacenar el número de entradas
		// de niños.
		int entradasN;

		// Creamos la variable entradasA como int para almacenar el número de entradas
		// de adultos.
		int entradasA;

		// Creamos la variable totalEntradas como double para almacenar el precio total
		// de las sumas de las entradas tanto infantiles como no.
		double totalEntradas;

		// Le pedimos al usuario que introduzca el número de entradas infantiles y lo
		// leemos.
		System.out.print("Introduce el número de entradas infantiles --> ");
		entradasN = sc.nextInt();

		// Le pedimos al usuario que introduzca el número de entradas adultas y lo
		// leemos.
		System.out.print("Introduce el número de entradas para adultos --> ");
		entradasA = sc.nextInt();

		// TotalEntradas es igual al números de entradas infantiles por el precio de
		// cada una, mas el número de entradas para adultos por su precio.
		totalEntradas = (entradasN * 15.50) + (entradasA * 20);

		// Comprobamos si el número total de entradas en mayor o igual que 100, si es
		// asi se le aplicará el 5% y si no sera el precio total de las entradas.
		totalEntradas = totalEntradas >= 100 ? totalEntradas - (totalEntradas * 0.05) : totalEntradas;

		// Imprimimos la cantidad a pagar en taquilla.
		System.out.println();
		System.out.println("Importe a pagar por " + entradasN + " entradas infantiles y " + entradasA
				+ " entradas de adultos --> " + totalEntradas + " euros");
		
		//Cierre de Scanner
		sc.close();

	}

}
