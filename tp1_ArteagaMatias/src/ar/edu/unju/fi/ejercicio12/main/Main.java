package ar.edu.unju.fi.ejercicio12.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		String nombre;
		String fechaString;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la Persona: ");
		nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento con el formato dd/mm/yyyy: ");
		fechaString = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar fechaNacimiento = Calendar.getInstance();
		try {
			fechaNacimiento.setTime(dateFormat.parse(fechaString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Ingreso mal el dato fecha, por favor respete el formato del ingreso de fecha.");
			//e.printStackTrace();
		}
		Persona nuevaPersona = new Persona(nombre, fechaNacimiento);
		System.out.println(nuevaPersona);
		
		scanner.close();
		
	}

}
