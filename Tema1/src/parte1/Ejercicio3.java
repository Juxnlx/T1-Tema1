package parte1;

import java.util.Scanner;

/**
 * Se pide el año actual y el de nacimiento y se muestra la edad del usuario.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el Scanner para poder leer por teclado.
		Scanner sc = new Scanner(System.in);

		// Craemos la variable yearActual para almacenar el año en el que estamos.
		int yearActual;

		// Creamos la variable yearNacimiento para almacenar el año de nacimiento del
		// usuario.
		int yearNacimiento;

		// Le pedimos al usuario en el año en el que nos encontramos.
		System.out.print("Introduce en que año estamos --> ");
		// Leemos la fecha introducida
		yearActual = sc.nextInt();

		// Le pedimos al usuario que introduzca su año de nacimiento.
		System.out.print("Introduce el año en el que naciste --> ");
		// Leemos la fecha de nacimiento introducida.
		yearNacimiento = sc.nextInt();

		// Salto de linea
		System.out.println();

		// Mostramos la edad del usuario
		System.out.println("La edad del usuario son --> " + (yearActual - yearNacimiento) + " años.");

		// Cierre de Scanner
		sc.close();
	}

}
