package parte1;

import java.util.Scanner;

/**
 * Solitamos al usuario si llueve, si ha terminado las tareas y si necesita ir a
 * la biblioteca y dependiendo de lo que responda mostraremos mediante TRUE o
 * FALSE si puede o no salir a la calle.
 */
public class Ejercicio13 {

	public static void main(String[] args) {

		// Creamos el Scanner para hacerle todas estas preguntas al usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la variable rain como boolean para almacenar true o false,
		// dependiendo de si llueve o no.
		boolean rain;
		
		// Creamos la variable homework como boolean para almacenar true o false,
		// dependiendo de si ha realizado las tareas o no.
		boolean homework;
		
		// Creamos la variable library como boolean para almacenar true o false,
		// dependiendo de si necesita ir a la biblioteca o no.
		boolean library;
		
		boolean total;
		
		// Le preguntamos al usuario si esta lloviendo y leemos su respuesta.
		System.out.print("¿Esta lloviendo? Responde: true o false --> ");
		rain = sc.nextBoolean();
		
		// Le preguntamos al usuario si ha finalizado la tarea y leemos su respuesta.
		System.out.print("¿Has finalizado la tarea? Responde: true o false --> ");
		homework = sc.nextBoolean();
		
		//Le preguntamos al usuario si necesita ir a la biblioteca.
		System.out.print("¿Necesitas ir a la biblioteca? Responde: true o false --> ");
		library = sc.nextBoolean();
		
		total = library ? true : (rain ? false : (homework ? true : false));
		
		System.out.println("¿Pordras salir a la calle? --> " + total);
	}

}
