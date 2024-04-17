package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[ ] numerosEnteros = new int[8];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("Ingrese el valor "+ (i+1) + ":");
			numerosEnteros[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println("El valor ingresado en el indice " + i + " es: " + numerosEnteros[i]);
		}
		
		scanner.close();
		
	}

}
