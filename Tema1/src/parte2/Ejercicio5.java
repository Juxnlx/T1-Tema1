package parte2;

import java.util.Scanner;

/**
 * Debemos de introducir una cantidad de segundos y nos debe mostrar cuantas
 * horas, minutos y segundos resulta ser todos esos minutos introducidos por el
 * usuario.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos el Scanner para pedirle al usuario los segundos.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable cantSegundos para almacenar los segundos introducidos por
		// el usuario.
		int cantSegundos;

		// Creamos la variable horas para almacenar las horas resultantes de los
		// segundos introducidos por el usuario.
		int horas;

		// Creamos la variable minutos para almacenar los minutos resultantes de los
		// segundos introducidos por el usuario.
		int minutos;

		// Creamos la variable segundos para almacenar los segundos resultantes de los
		// segundos introducidos por el usuario.
		int segundos;

		// Le pedimos al usuario que introduzca la cantidad de segundos y los leemos.
		System.out.print("Introduce la cantidad de segundos deseada --> ");
		cantSegundos = sc.nextInt();

		// Para calcular los segundos debemos de calcular el resto de los segundos entre
		// 60.
		segundos = cantSegundos % 60;

		// Para calcular los minutos debemos de saber el resto y para ello calculamos el
		// cociente de la cantidad de segundos entre 60 y ese cociente lo dividimos
		// entre 60 y asi nos da el resto que son los segundos.
		minutos = (cantSegundos / 60) % 60;

		// De la división anterior que hemos realizado para calcular los minutos nos
		// quedamos con el cociente y ese cociente son las horas.
		horas = (cantSegundos / 60) / 60;

		// Imprimimos la cantidad resultante de esos minutos en horas, minutos y
		// segundos.
		System.out.println();
		System.out.println("Los " + cantSegundos + " segundos son: " + horas + " horas, " + minutos + "minutos, "
				+ segundos + " segundos --> " + horas + ":" + minutos + ":" + segundos);

		// Cierre de Scanner
		sc.close();
	}

}
