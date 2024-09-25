package parte2;

import java.util.Scanner;

/**
 * Este programa le pide al usuario dos número 2 números y nos devulve la
 * cantidad que hay que sumarle a primer número para que sea multiplo del
 * segundo.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedirle números entero al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num1 como entero ya que el usuario debe de introducir un
		// número entero.
		int num1;

		// Creamos la variable num2 como entero ya que el usuario debe de introducir
		// otro
		// número entero.
		int num2;

		// Creamos la variable cantidadSumar como entero para mostrar la cantidad que se
		// le debe sumar al número introducido por el usuario para que sea multiplo de
		// 7.
		int cantidadSumar;

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número entero --> ");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número entero --> ");
		num2 = sc.nextInt();

		// Comprobamos si el resto es igual a 0, porque si es así, la cantidad a sumar
		// es 0 porque ya es multiplo de num2. En caso de que el resto no fuera 0
		// entonces a num2 le restamos el resto de la división entre num1 y num2.
		cantidadSumar = (num1 % num2) == 0 ? cantidadSumar = 0 : num2 - (num1 % num2);

		// Imprimimos el resultado
		System.out.println();
		System.out.println("Cantidad a sumar para ser múltiplo de 7 --> " + cantidadSumar);

		// Cierre de Scanner
		sc.close();
	}

}
