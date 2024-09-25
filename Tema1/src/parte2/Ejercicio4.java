package parte2;

import java.util.Scanner;

/**
 * Tenemos que pedir al usuario 3 números y realizar la ecuación de segundo
 * grado para resolver el valor de x.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedir a, b y c al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable a como int para almacenar el valor de a.
		int a;

		// Creamos la variable b como int para almacenar el valor de b.
		int b;

		// Creamos la variable c como int para almacenar el valor de c.
		int c;

		// Creamos la variable x1 como double para almacenar el primer resultado de la
		// ecuación de segundo grado.
		double x1;

		// Creamos la variable x2 como double para almacenar el segundo resultado de la
		// ecuación de segundo grado.
		double x2;

		// Le pedimos al usuario que introduzca el valor de "a" y lo leemos.
		System.out.print("Introduce el valor de a --> ");
		a = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de "b" y lo leemos.
		System.out.print("Introduce el valor de b --> ");
		b = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de "c" y lo leemos.
		System.out.print("Introduce el valor de c --> ");
		c = sc.nextInt();

		// Resolvemos la primera solución de la ecuación de segundo grado con la
		// ecuación: menos b mas la raiz cuadrada de b al cuadrado - 4 por a por c y
		// todo eso entre 2 por a.
		x1 = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

		// Resolvemos la segunda solución de la ecuación de segundo grado con la
		// ecuación: menos b menos la raiz cuadrada de b al cuadrado - 4 por a por c y
		// todo eso entre 2 por a.
		x2 = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

		// Imprimimos las dos soluciones de y
		System.out.println();
		System.out.println("y tienes dos soluciones = " + x1 + ", " + x2);

		// Cierre de Scanner
		sc.close();

	}

}
