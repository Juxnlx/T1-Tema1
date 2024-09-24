package parte1;

import java.util.Scanner;

/**
 * Coste de peras y manzanas introduciendo los kg de cada una, sabiendo el
 * precio al que esta el kilo.
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir los kg de cada fruta al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable kgPeras como double para almacenar los kilos de peras
		// introducidos por el usuario.
		double kgPeras;

		// Creamos la variable kgManzanas como double para almacenar los kilos de
		// manzanas introducidos por el usuario.
		double kgManzanas;

		// Creamos la variable total para guardar la cantidad total del coste.
		double total;

		// Le pedimos al usuario que introduzca los kg de peras y los leemos por
		// teclado.
		System.out.print("Introduce los kg de PERAS --> ");
		kgPeras = sc.nextDouble();

		// Le pedimos al usuario que introduzca los kg de manzanas y los leemos por
		// teclado.
		System.out.print("Introduce los kg de MANZANAS --> ");
		kgManzanas = sc.nextDouble();

		// Realizamos la ecuación asignando a la variable total la suma de las
		// cantidades de peras y manzanas.
		total = (kgPeras*1.95) + (kgManzanas*2.35);

		// Imprimimos la suma total a pagar
		System.out.println();
		System.out.println("COSTE DE PERAS Y MANZANAS");
		System.out.println("Coste de PERAS --> " + kgPeras*1.95 + " euros");
		System.out.println("Coste de MANZANAS --> " + kgManzanas*2.35 + " euros");
		System.out.println("Total de PERAS y MANZANAS es de --> " + total + " EUROS");
		
		//Cierre de Scanner
		sc.close();
	}

}
