package parte2;

import java.util.Scanner;

/**
 * Este programa le pide al usuario un número y el programa debe de mostrar el
 * número que se le debe de sumar a esa cantidad para que sea múltiplo de 7.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedirle un número entero al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num como entero ya que el usuario debe de introducir un
		// número entero.
		int num;

		// Creamos la variable cantidadSumar como entero para mostrar la cantidad que se
		// le debe sumar al número introducido por el usuario para que sea multiplo de
		// 7.
		int cantidadSumar;

		// Le pedimos al usuario que introduzca un número y lo leemos.
		System.out.print("Introduce un número entero --> ");
		num = sc.nextInt();

		// Esta es la ecuación para resolver la cantidad a sumar. Seria el divisor menos
		// el resto de la división.
		cantidadSumar = (num % 7) == 0 ? 0 : 7 - (num % 7);


		// Imprimimos el resultado
		System.out.println();
		System.out.println("Cantidad a sumar para ser múltiplo de 7 --> " + cantidadSumar);

		// Cierre de Scanner
		sc.close();
	}

}
