package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		int opcion;
		boolean salir = false;
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		do {
			mostrarMenu();
			opcion = verificarEntradaDeDatoInt( scanner, "Ingrese opcion de operacion: ");
			switch (opcion) {
			case 1:
				cargarJugador(jugadores, scanner);
				break;
			case 8:
				salir = true;
				System.out.println("Saliendo del menu.");
				break;
			default:
				System.out.println("Ingreso un numero de opcion invalido. Por favor vuelva a intentarlo.");
				break;
			}
		} while (salir == false);
		
		System.out.println("Fin del programa.");
		
		scanner.close();

	}
	
	private static void cargarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		Jugador jugadorNuevo = new Jugador();
		System.out.println("Ingresar nuevo jugador ");
		System.out.println("Ingrese nombre de jugador: ");
		jugadorNuevo.setNombre(scanner.next());
		System.out.println("Ingrese apellido de jugador: ");
		jugadorNuevo.setApellido(scanner.next());
		jugadorNuevo.setFechaDeNacimiento(verificarFecha(scanner, "Ingrese fecha de nacimiento Formato(Formato: dd/MM/yyyy): "));
		System.out.println("Ingrese nacionalidad de jugador: ");
		jugadorNuevo.setNacionalidad(scanner.next());		
		jugadorNuevo.setEstatura(verificarEntradaDeDatoFloat(scanner, "Ingrese estatura de jugador: "));
		jugadorNuevo.setPeso(verificarEntradaDeDatoInt(scanner, "Ingrese peso de jugador: "));
		jugadorNuevo.setPosicion(verificarPosicionJugador(scanner, "Ingrese posicion de jugador (delantero,medio,defensa,arquero): "));
		jugadores.add(jugadorNuevo);
	}

	public static void mostrarMenu() {
		System.out.println( "Menu: " + "\n" +
							"1 – Alta de jugador." + "\n" +
							"2 – Mostrar los datos del jugador." + "\n" +
							"3 – Mostrar todos los jugadores ordenados por apellido." + "\n" +
							"4 – Modificar los datos de un jugador." + "\n" +
							"5 – Eliminar un jugador." + "\n" +
							"6 – Mostrar la cantidad total de jugadores que tiene el ArrayList." + "\n" +
							"7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad." + "\n" +
							"8 – Salir.");
	}
	
	public static int verificarEntradaDeDatoInt(Scanner scanner, String mensaje) {
		int entradaEntero = 0;
		boolean entradaValida = false;
		
		while (!entradaValida) {
			try {
				System.out.println(mensaje);
				entradaEntero = scanner.nextInt();
				entradaValida = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Error en el ingreso de datos. Debe ingresar un numero entero valido.");
				scanner.nextLine();
			}
		}
		
		return entradaEntero;
	}
	
	public static Float verificarEntradaDeDatoFloat(Scanner scanner, String mensaje) {
		Float entradaNumero = 0f;
		boolean entradaValida = false;
		
		while (!entradaValida) {
			try {
				System.out.println(mensaje);
				entradaNumero = scanner.nextFloat();
				entradaValida = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Error en el ingreso de datos. Debe ingresar un numero valido.");
				scanner.nextLine();
			}
		}
		
		return entradaNumero;
	}
	
	public static String verificarPosicionJugador(Scanner scanner, String mensaje) {
		String eleccion;
		boolean eleccionCorrecta = false;
		do {
			System.out.println(mensaje);
			eleccion = scanner.next();
			if (eleccion.equals("delantero") || eleccion.equals("medio") || eleccion.equals("defensa")
					|| eleccion.equals("arquero")) {
				eleccionCorrecta = true;
			} else {
				System.out.println(
						"Ingreso un dato incorrecto. Por favor ingrese los datos entre (delantero,medio,defensa,arquero)");
			} 
		} while (!eleccionCorrecta);
		return eleccion;
	}
	
	public static LocalDate verificarFecha(Scanner scanner, String mensaje) {
		LocalDate eleccion = LocalDate.now();
		boolean eleccionCorrecta = false;
		String fechadenacimientoString;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.println(mensaje);
				fechadenacimientoString = scanner.next();
				eleccion = LocalDate.parse(fechadenacimientoString, formatter);
				eleccionCorrecta = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Ingreso un formato de fecha erroneo. Por favvor ingrese una fecha con el formato correspondiente");
			}
		} while (!eleccionCorrecta);
		return eleccion;
	}

}
