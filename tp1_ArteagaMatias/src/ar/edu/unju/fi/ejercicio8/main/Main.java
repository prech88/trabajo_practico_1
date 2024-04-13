package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		int valorDeRepeticionesDeCalculo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor para calcular: ");
		valorDeRepeticionesDeCalculo=scanner.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(valorDeRepeticionesDeCalculo);
		System.out.println("El valor de la sumatoria es: "+calculadora.calcularSumatoria()+"\n"+"El valor de la productoria es: "+calculadora.calcularProductoria());
		scanner.close();
	}

}