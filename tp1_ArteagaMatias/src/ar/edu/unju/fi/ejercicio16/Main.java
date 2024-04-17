package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] nombresPersonas = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < nombresPersonas.length; i++) {
			System.out.println("Ingrese el nombre " + (i + 1) + ":");
			nombresPersonas[i] = scanner.next();
		}
		int inicioArreglo = 0;
		while (inicioArreglo < nombresPersonas.length) {
			System.out.println(nombresPersonas[inicioArreglo]);
			inicioArreglo++;
		}
		System.out.println("El tamaño del arreglo es: " + nombresPersonas.length);
		System.out.println("Elija el indice del elemento a eliminar: ");
		byte elementoAEliminar = scanner.nextByte();
		do {
			if (elementoAEliminar == nombresPersonas.length-1) {
				nombresPersonas[elementoAEliminar] = "";
				elementoAEliminar++;
			}else {
				nombresPersonas[elementoAEliminar] = nombresPersonas[elementoAEliminar+1];
				elementoAEliminar++;
			}
		} while (elementoAEliminar < nombresPersonas.length);
		for (String string : nombresPersonas) {
			System.out.println(string);
		}
		scanner.close();
	}

}
