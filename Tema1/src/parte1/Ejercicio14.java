package parte1;

import java.util.Scanner;

/**
 * Le pedimos al usuario 3 notas y debemos de realizar la nota media e
 * imprimirlas con decimales y solo parte entera.
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir los 3 números al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable nota1 como int para guardar la nota del primer trimestre.
		int nota1;

		// Creamos la variable nota2 como int para guardar la nota del segundo
		// trimestre.
		int nota2;

		// Creamos la variable nota3 como int para guardar la nota del tercer trimestre.
		int nota3;

		double notaMedia;

		// Le pedimos al usuario la nota del primer trimestre y la leemos.
		System.out.print("Introduce la nota del primer trimestre --> ");
		nota1 = sc.nextInt();

		// Le pedimos al usuario la nota del segundo trimestre y la leemos.
		System.out.print("Introduce la nota del primer trimestre --> ");
		nota2 = sc.nextInt();

		// Le pedimos al usuario la nota del tercer trimestre y la leemos.
		System.out.print("Introduce la nota del primer trimestre --> ");
		nota3 = sc.nextInt();

		// Ecuación para asignar a nuestra variable notaMedia la media de los tres
		// trimestres.
		notaMedia = (nota1 + nota2 + nota3) / 3;

		// Imprimimos la nota media del curso.
		System.out.println();
		// Realizamos un casteo a la hora de imprimir para que nos muestre solo la parte
		// entera.
		System.out.println("Nota media del boletín de calificaciones --> " + (int) notaMedia);
		System.out.println("Nota media del expediente académico --> " + notaMedia);

		// Cierre dE Scanner
		sc.close();

	}

}
