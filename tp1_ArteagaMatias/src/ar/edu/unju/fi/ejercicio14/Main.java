package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar un numero entero entre 3 y 10: ");
		try {
			int tamanioArreglo = scanner.nextInt();
			if (tamanioArreglo > 2 && tamanioArreglo < 11) {
				int[] numerosEnteros = new int[tamanioArreglo];
				for (int i = 0; i < numerosEnteros.length; i++) {
					System.out.println("Ingrese el valor " + (i + 1) + ":");
					numerosEnteros[i] = scanner.nextInt();
				}
				int sumaTotalArreglo = 0;
				for (int numero : numerosEnteros) {
					System.out.println(numero);
					sumaTotalArreglo = sumaTotalArreglo + numero;
				}
				System.out.println("La suma total de el arreglo es: " + sumaTotalArreglo);
				scanner.close();
			}else {
				System.out.println("Ingreso valores enteros que no estan entre 3 y 10.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el ingreso de datos.");
			//e.printStackTrace();
		}

	}

}
