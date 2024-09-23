package parte1;

import java.util.Scanner;

/**
 * Introducir un número y mostrarlo por consola.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable número para almacenar el número introducido por el
		// usuario.
		int numero;

		// Le pedimos al usuario que introduzca un número.
		System.out.println("Introduce un número --> ");
		// Leemos el número
		numero = sc.nextInt();

		// Imprimimos el resultado introducido por el usuario.
		System.out.println("El número introducido es: " + numero);

		// Cierre del Scanner
		sc.close();

	}

}
