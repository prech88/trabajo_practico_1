package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero entero: ");
		
		do {
			numero = scanner.nextInt();
			if(numero <1 || numero>9) {
				System.out.println("Por favor vuelva a ingresar un numero entre 1 y 9");
			}
		}while(numero <1 || numero>9 );
		
		for(int i=0;i<=10;i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
		scanner.close();
		
	}

}
