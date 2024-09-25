package parte2;

import java.util.Scanner;

/**
 * Este programa le pide al usuario 3 longitudes en distentas medidas, el
 * programa debe de sumar las tres y mostrarlas en cm.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir al usuario las 3 longitudes.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable milimetros como double para almacenar la longitud
		// introducida por el usuario en milímetros.
		double milimetros;

		// Creamos la variable centrimetros como double para almacenar la longitud
		// introducida por el usuario en centímetros.
		double centrimetros;

		// Creamos la variable metros como double para almacenar la longitud
		// introducida por el usuario en metros.
		double metros;

		// Le pedimos al usuario que introduzca la primera longitud en milímetros y la
		// leemos.
		System.out.print("Introduce la primera longitud en milímetros -->");
		milimetros = sc.nextDouble();

		// Le pedimos al usuario que introduzca la segunda longitud en centimetros y la
		// leemos.
		System.out.print("Introduce la segunda longitud en centímetros -->");
		centrimetros = sc.nextDouble();

		// Le pedimos al usuario que introduzca la tercera longitud en metros y la
		// leemos.
		System.out.print("Introduce la tercera longitud en metros -->");
		metros = sc.nextDouble();
	}

}
