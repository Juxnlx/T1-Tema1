package parte1;

import java.util.Scanner;

/**
 * Consiste en pedir al usuario su nombre, dirección y teléfono, y lo imprimimos
 * por consola de una manera concreta.
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable name para guardar el nombre del usuario.
		String name;

		// Creamos la variable address para guardar la dirección del usuario.
		String address;

		// Creamos la variable phoneNumber para guardar el número del usuario.
		int phoneNumber;

		// Le pedimos al usuario que introduzca su nombre y lo leemos.
		System.out.print("Introduce tu nombre --> ");
		name = sc.nextLine();

		// Le pedimos al usuario que introduzca su dirección y la leemos.
		System.out.print("Introduce tu dirección --> ");
		address = sc.nextLine();

		// Le pedimos al usuario que introduzca su número de teléfono y lo leemos.
		System.out.print("Introduce tu número de teléfono --> ");
		phoneNumber = sc.nextInt();

		// Imprimimos por consola todos los datos pedidos al usuario.
		System.out.println();
		System.out.println("Datos personales de " + name);
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + address);
		System.out.println("Teléfono: " + phoneNumber);

		// Cierre de Scanner
		sc.close();
	}

}
