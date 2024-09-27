package parte2;

import java.util.Scanner;

/**
 * Este programa nos pide una longitud en metros y el programa debe de imprimir
 * por consola solo la parte entera de esa longitud en centímetros.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedirle al usuario la cantidad en metros.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable metros como double para almacenar la longitud en metros
		// introducida por el usuario.
		double metros;

		// Creamos la variable centímetros como int para almacenar solo la parte entera
		// de esos centímetros.
		int centimetros;

		// Le pedimos al usuario que introduzca la longitud en metros.
		System.out.print("Introduce la cantidad en metros --> ");
		metros = sc.nextDouble();

		// Pasamos los metros a centimetros multiplicando por 100 y hacemos un casteo
		// con int para quedarnos solo con la parte entera.
		centimetros = (int) (metros * 100);

		// Imprmimos el resultado en centimetros
		System.out.println();
		System.out.println("La longitud del lanzamiento en cm es de --> " + centimetros + " cm");

		// Cierre de Scanner
		sc.close();

	}

}
