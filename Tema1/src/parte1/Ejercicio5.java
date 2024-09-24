package parte1;

import java.util.Scanner;

/**
 * Diseño de una aplicación de calculo de longitud y area de una circunferencia
 * mediante el radio de la circunferencia.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos el Scanner para poder pedir al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable radio para almacenar el radio de la circunferencia, lo
		// declaramos double porque puede ser decimal.
		double radio;

		// Creamos la variable longitud para almacenar la longitud de la circunferencia.
		double longitud;

		// Creamos la variable area para almacenar el area de la circunferencia.
		double area;

		// Le pedimos al usuario por teclado el radio de la circunferencia.
		System.out.print("Introduce el radio de la circunferencia --> ");
		radio = sc.nextDouble();

		// Realizamos la ecuación para resolver la longitud.
		longitud = 2 * Math.PI * radio;

		// Realizamos la ecuación para resolver el area.
		area = Math.PI * Math.pow(radio, 2);

		// Salto de linea
		System.out.println();

		// Mostramos por consola el resultado de la longitud y del area.
		System.out.println("La longitud de la circunferencia es --> " + longitud);
		System.out.println("El area de la circunferencia es --> " + area);

		// Cierre de Scanner
		sc.close();
	}

}
