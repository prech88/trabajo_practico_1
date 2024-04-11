package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechadenacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int dni, String nombre, LocalDate fechadenacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechadenacimiento = fechadenacimiento;
		this.provincia = provincia;
	}

	public Persona(int dni, String nombre, LocalDate fechadenacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechadenacimiento = fechadenacimiento;
		this.provincia = "Jujuy";
	}

	public int calcularEdadDePersona() {
		int edad;
		LocalDate fechahoy = LocalDate.now();
		Period periodo = Period.between(fechadenacimiento, fechahoy);
		edad = periodo.getYears();
		return edad;
	}
	
	public boolean verificarMayorDeEdad() {
		if (calcularEdadDePersona()>18) {
			return true;
		}
		return false;
	}
	
	public String mostrarDatos() {
		String mensajeEdad;
		if (verificarMayorDeEdad()) {
			mensajeEdad = "La persona es mayor de edad";
		}else {
			mensajeEdad = "La persona no es mayor de edad";
		}
		return "Dni:" + dni + ", Nombre:" + nombre + ", Fecha de nacimiento:" + fechadenacimiento
				+ ", Provincia:" + provincia + ", Edad:" + calcularEdadDePersona() + " " + mensajeEdad;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechadenacimiento() {
		return fechadenacimiento;
	}
	public void setFechadenacimiento(LocalDate fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
