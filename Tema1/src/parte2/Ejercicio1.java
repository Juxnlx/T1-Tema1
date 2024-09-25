package parte2;

import java.util.Scanner;

/**
 * Pedimos al usuario un número con decimales y lo debemos imprimir redondeado
 * al entero más próximo.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir el número decimal al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable numDec como double para almacenar el número introducido
		// por el usuario.
		double numDec;

		// Creamos la variable result como int para almacenar el resultado redondeado.
		int result;

		// Le pedimos al usuario que introduzca un número con decimales y lo leemos
		System.out.println();
		numDec = sc.nextDouble();

		// Comprobamos que el número decimal sea mayor que la parte entera del decimal
		// con 0.5, si es así sumamos 1 a la parte decimal, si no solo mostralos la
		// parte decimal del número.
		result = (int) (numDec >= (int) numDec + 0.5 ? ++numDec : numDec);

		//Imprimimos el resultado
		System.out.println();
		System.out.println("El número redondeado al entero más próximo es --> " + result);
		
		//Cierre de Scanner 
		sc.close();

	}

}
