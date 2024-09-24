package parte1;

import java.util.Scanner;

/**
 * Pedimos dos notas por teclado y nos muestra por consola la media de las dos.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable nota1 para almacenar la primera nota.
		int nota1;

		// Creamos la variable nota2 para almacenar la segunda nota.
		int nota2;

		// Creamos la variable notaMedia para almacenar el resultado de la media de
		// estos dos números.
		double notaMedia;

		// Le pedimos al usuario que introduzca la primera nota.
		System.out.print("Introduce la primera nota --> ");
		// Leemos la primera nota del teclado.
		nota1 = sc.nextInt();

		// Le pedimos al usuario que introduzca la segunda nota.
		System.out.print("Introduce la primera nota --> ");
		// Leemos la segunda nota del teclado.
		nota2 = sc.nextInt();

		// A la variable nota media le asignamos la ecuación para calcular la nota media
		// entre estas dos notas.
		notaMedia = (double) (nota1 + nota2) / 2;

		// Mostramos la nota media
		System.out.println("La nota media de estas dos notas es: " + notaMedia);

		// Cierre del Scanner
		sc.close();
	}

}
