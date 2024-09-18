package helloworld;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {

		//Creamos el Scanner para pedir teclado.
		Scanner sc = new Scanner(System.in);
		
		String nombre = "";
		
		String primerApellido = "";
		String segundoApellido = "";
		
		System.out.print("Introduce tu nombre --> ");
		nombre = sc.nextLine();
		
		System.out.print("Introduce tu primer apellido --> ");
		primerApellido = sc.nextLine();
		
		System.out.print("Introduce tu segundo apellido --> ");
		primerApellido = sc.nextLine();
		
		System.out.println("!Hello world! My name is " + nombre + " " + primerApellido + " " + segundoApellido);
		
		sc.close();
	}

}
