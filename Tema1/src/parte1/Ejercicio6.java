package parte1;

import java.util.Scanner;

/**
 * Programa que calcula la suma, resta, multiplicación y división entre dos
 * números que pediremos por teclado.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos el Scanner para leer por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable num1 para guardar el primer número.
		int num1;

		// Creamos la variable num2 para guardar el segundo número.
		int num2;

		// Le pedimos al usuario el número 1 y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();

		// Le pedimos al usuario el número 2 y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextInt();

		// Imprimimos los resultados de las distintas operaciones.
		System.out.println("Ecuaciones entre " + num1 + " y " + num2);
		System.out.println();
		System.out.println("Suma --> " + (num1 + num2));
		System.out.println("Resta --> " + (num1 - num2));
		System.out.println("Multilicación --> " + (num1 * num2));
		System.out.println("División --> " + (num1 / num2));

		// Cierre de Scanner
		sc.close();
	}

}
