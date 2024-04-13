package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		int dni;
		String nombre;
		LocalDate fechadenacimiento;
		String fechadenacimientoString;
		String provincia;
		Scanner scanner = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Persona persona1 = new Persona();
		System.out.println("Ingrese DNI: ");
		persona1.setDni(scanner.nextInt());
		System.out.println("Ingrese Nombre: ");
		persona1.setNombre(scanner.next());
		System.out.println("Ingrese fecha de nacimiento Formato(Formato: yyyy-MM-dd): ");
		fechadenacimientoString = scanner.next();
        fechadenacimiento = LocalDate.parse(fechadenacimientoString, formatter);
        persona1.setFechadenacimiento(fechadenacimiento);
        System.out.println("Ingrese Provincia: ");
        persona1.setProvincia(scanner.next());
        
        System.out.println("Ingrese DNI: ");
        dni = scanner.nextInt();
		System.out.println("Ingrese Nombre: ");
		nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento Formato(Formato: yyyy-MM-dd): ");
		fechadenacimientoString = scanner.next();
        fechadenacimiento = LocalDate.parse(fechadenacimientoString, formatter);
        System.out.println("Ingrese Provincia: ");
        provincia = scanner.next();
		Persona persona2 = new Persona(dni, nombre, fechadenacimiento, provincia);
        
        System.out.println("Ingrese DNI: ");
        dni = scanner.nextInt();
		System.out.println("Ingrese Nombre: ");
		nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento Formato(Formato: yyyy-MM-dd): ");
		fechadenacimientoString = scanner.next();
        fechadenacimiento = LocalDate.parse(fechadenacimientoString, formatter);
		Persona persona3 = new Persona(dni, nombre, fechadenacimiento);
		
		System.out.println(persona1.mostrarDatos());
		System.out.println(persona2.mostrarDatos());
		System.out.println(persona3.mostrarDatos());
		
		scanner.close();

	}

}
