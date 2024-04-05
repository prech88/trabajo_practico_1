package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		int resultado;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero entero: ");
		do {
			numero = scanner.nextInt();
			if(numero <0 || numero>10) {
				System.out.println("Por favor vuelva a ingresar un numero entre 0 y 10");
			}
		}while(numero <0 || numero>10 );
		
		if(numero == 0 || numero == 1) {
			resultado=1;
		}else {
			resultado=1;
			while (numero > 0) {
				resultado=resultado*numero;
				numero=numero-1;
			}
		}
		System.out.println("El resultado es: "+resultado);
		scanner.close();
	}

}
