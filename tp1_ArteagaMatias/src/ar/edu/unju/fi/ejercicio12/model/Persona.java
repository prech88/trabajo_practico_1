package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaDeNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public long calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		return (hoy.getTimeInMillis() - fechaDeNacimiento.getTimeInMillis())/1000/60/60/24/365;
	}
	
	public String encontrarSignoZodiacal() {
		String signo = "";
		int mes = fechaDeNacimiento.get(Calendar.MONTH)+1;
		int dia = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			signo = "Aries";
		}
		if((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			signo = "Tauro";
		}
		if((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			signo = "Geminis";
		}
		if((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			signo = "Cancer";
		}
		if((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			signo = "Leo";
		}
		if((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			signo = "Virgo";
		}
		if((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			signo = "Libra";
		}
		if((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			signo = "Escorpio";
		}
		if((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			signo = "Sagitario";
		}
		if((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			signo = "Capricornio";
		}
		if((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			signo = "Acuario";
		}
		if((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
			signo = "Piscis";
		}
		return signo;
	}
	
	public String encontrarEstacionDeNacimiento() {
		String estacionDelAnio = "";
		int mes = fechaDeNacimiento.get(Calendar.MONTH)+1;
		int dia = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if((mes == 12 && dia >= 21) || (mes == 1) || (mes == 2) || (mes == 3 && dia < 20)) {
			estacionDelAnio = "Verano";
		}
		if((mes == 3 && dia >= 20) || (mes == 4) || (mes == 5) || (mes == 6 && dia < 21)) {
			estacionDelAnio = "Otoño";
		}
		if((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia < 23)) {
			estacionDelAnio = "Invierno";
		}
		if((mes == 9 && dia >= 23) || (mes == 10) || (mes == 11) || (mes == 12 && dia < 21)) {
			estacionDelAnio = "Primavera";
		}
		return estacionDelAnio;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "Nombre: " + nombre + "\n" + 
				"Fecha nacimiento: " + dateFormat.format(fechaDeNacimiento.getTime()) + "\n" +
				"Edad: " + calcularEdad() + "\n" + 
				"Signo del zodiaco: " + encontrarSignoZodiacal() + "\n" + 
				"Estacion: " + encontrarEstacionDeNacimiento();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
