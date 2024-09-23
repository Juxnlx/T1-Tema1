package parte1;

import java.util.Scanner;

/**
 * Esta clase nos pidira nuestra edad y nos mostrara la edad que tendriamos
 * dentro de un año.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el Scanner para poder leer por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable edad, para guardar la edad del usuario.
		int edad;

		// Le pedimos al usuario que introduzca su edad.
		System.out.print("Introduce tu edad --> ");
		// Leemos la edad del usuario
		edad = sc.nextInt();

		// Mostramos la edad del usuario un año mas tarde.
		System.out.println("La edad del usuario actualmente es: " + edad + " años, el año que viene tendra "
				+ (edad + 1) + " años.");

		// Cierre de Scanner
		sc.close();
	}

}
