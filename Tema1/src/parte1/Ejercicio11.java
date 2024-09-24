package parte1;

import java.util.Scanner;

/**
 * Conversor de pesetas a euros, le pediremos al usuario que introduzca las
 * pesetas y le mostramos la conversión en euros.
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable pesetas como double para almacenar la cantidad de pesetas
		// introducidas por el usuario.
		double pesetas;

		// Le pedimos al usuario que introduzca las pesetas y las leemos.
		System.out.print("Introduce la cantidad de pesetas a convertir --> ");
		pesetas = sc.nextDouble();

		/*
		 * Imprimimos la solución directamente y la ecuación de la conversión la hacemos
		 * dentro de la impresión. Seria una regla del 3, pesetas introducidas por 1
		 * entre 166 y nos mostraria la conversión.
		 */
		System.out.println(pesetas + " ptas son --> " + (pesetas * 1) / 166 + " EUROS");

		// Cierre de Scanner
		sc.close();

	}

}
