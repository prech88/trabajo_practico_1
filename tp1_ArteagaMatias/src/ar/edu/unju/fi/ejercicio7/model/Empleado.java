package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private Float salario;
	final Float SALARIO_MINIMO = 210000f;
	final Float AUMENTO_POR_MERITOS = 20000f;
	
	public Empleado(String nombre, int legajo, Float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario>=SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void mostrarDatosEmpleado() {
		System.out.println("Nombre del empleado: " + nombre + "\n" +
							"Legajo: " + legajo + "\n" +
							"Salario: " + salario + "$");
	}
	
	public void darAumento() {
		salario = salario + AUMENTO_POR_MERITOS;
	}

}