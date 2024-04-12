package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		String nombreNuevoEmpleado;
		int legajoNuevoEmpleado;
		Float salarioNuevoEmpleado;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese los datos del nuevo empleado" + "\n" + "Nombre del empleado: ");
		nombreNuevoEmpleado = scanner.next();
		System.out.println("Legajo: ");
		legajoNuevoEmpleado = scanner.nextInt();
		System.out.println("Salario: ");
		salarioNuevoEmpleado = scanner.nextFloat();
		
		Empleado nuevoEmpleado = new Empleado(nombreNuevoEmpleado, legajoNuevoEmpleado, salarioNuevoEmpleado);
		nuevoEmpleado.mostrarDatosEmpleado();
		nuevoEmpleado.darAumento();
		nuevoEmpleado.mostrarDatosEmpleado();
		
	}

}
