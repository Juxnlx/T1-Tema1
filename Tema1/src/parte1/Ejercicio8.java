package parte1;

import java.util.Scanner;

/**
 * Le pedimos al usuario su nombre y edad y mostramos un mensaje concreto con
 * dichos valores.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado
		Scanner sc = new Scanner(System.in);

		// Creamos la variable name para guardar el nombre del usuario.
		String name;

		// Creamos la variable age para guardar la edad del usuario.
		int age;

		// Le pedimos al usuario que introduzca su nombre y lo leemos.
		System.out.print("Introduce tu nombre --> ");
		name = sc.nextLine();

		// Le pedimos al usuario que introduzca su edad y lo leemos.
		System.out.print("Introduce tu edad --> ");
		age = sc.nextInt();

		// Imprimimos un mensaje con la infomación solicitada al usuario.
		System.out.println();
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");

		// Cierre de Scanner
		sc.close();
	}

}
