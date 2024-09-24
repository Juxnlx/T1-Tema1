package parte1;

import java.util.Scanner;

/**
 * Comprobamos si el número introducido por el usuario es 0.
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir el número por teclado
		Scanner sc = new Scanner(System.in);

		// Creamos la variable number para guardar el número introducido por el esuario.
		int number = 0;

		// Creamos la variable result como booleana para comprobar si el número es par o
		// no.
		boolean result;
		
		//Le pedimos al usuario un número y lo leemos.
		System.out.print("Introduce un número --> ");
		number = sc.nextInt();

		// Le asignamos a result false o true si se cumple que el modulo del número
		// entre 2 es 0.
		result = number%2 == 0;

		//Imprimimos el resultado de si nuestro número es PAR o IMPAR
		System.out.println();
		System.out.println("¿Es el número PAR? --> " + result);

		// Cierre de Scanner
		sc.close();

	}

}
