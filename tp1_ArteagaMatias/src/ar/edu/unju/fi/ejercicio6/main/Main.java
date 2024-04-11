package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(1988, 5, 15);
		Persona persona = new Persona();
		persona.setDni(34223558);
		persona.setNombre("Omega");
		persona.setFechadenacimiento(fecha);
		persona.setProvincia("Jujuy");
		System.out.println(persona.mostrarDatos());

	}

}
