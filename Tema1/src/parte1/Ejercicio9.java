package parte1;

import java.util.Scanner;

// Le pedimos al usuario su edad y comprobamos si es o no menor de edad, y imprimimos el resultado.
public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir la edad al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable age para guardar la edad del usuario.
		int age;

		// Creamos la variable boolean result para guardar el resultado de la posible
		// mayoria de edad del usuario.
		boolean result;

		// Le pedimos al usuario que introduzca su edad y lo leemos.
		System.out.print("Introduce tu edad --> ");
		age = sc.nextInt();

		// Realizamos la ecuación para comprobar si el usuario es mayor de edad.
		result = age >= 18;

		// Imprimimos el resultado.
		System.out.println("¿Es mayor de edad? --> " + result);

		// Cierre de Scanner
		sc.close();
	}

}
