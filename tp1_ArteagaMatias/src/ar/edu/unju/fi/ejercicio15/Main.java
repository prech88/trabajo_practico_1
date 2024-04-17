package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar un numero entero entre 5 y 10: ");
		try {
			int tamanioArreglo = scanner.nextInt();
			if (tamanioArreglo > 4 && tamanioArreglo < 11) {
				String[] nombresPersonas = new String[tamanioArreglo];
				for (int i = 0; i < nombresPersonas.length; i++) {
					System.out.println("Ingrese el nombre " + (i + 1) + ":");
					nombresPersonas[i] = scanner.next();
				}
				for (String nombre : nombresPersonas) {
					System.out.println(nombre);
				}
				for (int i = nombresPersonas.length-1; i >=0; i--) {
					System.out.println(nombresPersonas[i]);
				}
				scanner.close();
			}else {
				System.out.println("Ingreso valores enteros que no estan entre 5 y 10.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el ingreso de datos.");
			//e.printStackTrace();
		}

	}

}
