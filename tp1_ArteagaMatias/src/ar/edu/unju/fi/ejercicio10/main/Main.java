package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			boolean verificadorDeIngresoIncorrectoDeDatos = false;
			Double diametro;
			String ingredientesEspeciales;
			System.out.println("Ingrese los datos de la pizza " + i + ": ");
			Pizza pizza = new Pizza();
			System.out.println("Ingrese diametro de la pizza (20, 30 o 40): ");
			diametro = scanner.nextDouble();
			
			if(diametro==20||diametro==30||diametro==40) {
				pizza.setDiametro(diametro);
			}else {
				verificadorDeIngresoIncorrectoDeDatos = true;
			}
			
			System.out.println("Ingrese si tiene o no ingredientes especiales (true o false): ");
			ingredientesEspeciales = scanner.next();
			
			if (ingredientesEspeciales.compareTo("true")==0||ingredientesEspeciales.compareTo("false")==0) {
				pizza.setIngredientesEspeciales(Boolean.parseBoolean(ingredientesEspeciales));
			}else {
				verificadorDeIngresoIncorrectoDeDatos = true;
			}
			
			if(verificadorDeIngresoIncorrectoDeDatos) {
				System.out.println("Ingreso datos de pizza incorrectos, pro favor vuelva a intentarlo.");
				i--;
			}else {
				System.out.println("** Pizza "+i+"**"+"\n"+pizza+"\n"+"--------------------------------");
			}
			
		}
		
		scanner.close();

	}

}
