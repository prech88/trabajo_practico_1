package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Ingrese los datos de la pizza " + i + ": ");
			Pizza pizza = new Pizza();
			System.out.println("Ingrese diametro de la pizza (20, 30 o 40): ");
			pizza.setDiametro(scanner.nextDouble());
			System.out.println("Ingrese si tiene o no ingredientes especiales (true o false): ");
			pizza.setIngredientesEspeciales(Boolean.parseBoolean(scanner.next()));
			if(i==1) {
				pizza1 = pizza;
			}
			if(i==2) {
				pizza2 = pizza;
			}
			if (i==3) {
				pizza3 = pizza;
			}
		}
		
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);
		
		scanner.close();

	}

}
