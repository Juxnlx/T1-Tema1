package parte1;

import java.util.Scanner;

/**
 * Se le pedira un precio al usuario y se le mostrara la cantidad total con el
 * IVA incluido.
 */
public class Ejercicio15 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir la cantidad al usuario.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable IVA como constante ya que no cambia siempre sera el
		// 21%.
		final int IVA = 21;

		// Declaramos la variable price como una variable double, ya que el usuario
		// puede introducir una cantidad con decimales.
		double price;

		// Le pedimos al usuario que introduzca la cantidad y la leemos
		System.out.print("Introduze el precio --> ");
		price = sc.nextDouble();

		// Ecuación para resolver el precio total. Seria el precio mas el precio por el
		// 21% (0.21).
		price += (price * IVA / 100);

		// Imprimimos el resultado total
		System.out.println();
		System.out.println("Precio total con IVA incluido --> " + price);
	}

}
