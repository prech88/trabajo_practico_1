package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		int opcion;
		boolean salir = false;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Pais> paises = new ArrayList<>();
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		cargarPaises(paises);
		
		do {
			mostrarMenu();
			opcion = verificarEntradaDeDatoInt( scanner, "Ingrese opcion de operacion: ");
			switch (opcion) {
			case 1:
				DestinoTuristico destino = cargarDestino(paises, scanner);
				if(destino.getPais() == null || destino.getCantidadDeDias() <= 0){
					System.out.println("Error en la carga de datos." + "\n" +
										"Ingreso un codigo de pais inexistente o cargo una cantidas de dias menores a 1");
				}else {
					destinos.add(destino);
				}
				break;
			case 2:
				mostrarDestinosCargados(destinos);
				break;
			case 3:
				modificarPaisDeDestinoTuristico(destinos, paises, scanner);
				break;
			case 4:
				destinos.clear();
				break;
			case 5:
				eliminarDestinoTuristico(destinos, scanner);
				break;
			case 6:
				mostrarDestinosTuristicosOrdenadosNombre(destinos);
				break;
			case 7:
				mostrarPaisesCargados(paises);
				break;
			case 8:
				mostrarDestinosTuristicosPaisElegido(destinos, scanner);
				break;
			case 9:
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
	
	private static void mostrarDestinosTuristicosPaisElegido(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
		if (destinos.isEmpty()) {
			System.out.println("La Lista de destinos esta vacia");
		}else {
			int codigoBuscado = verificarEntradaDeDatoInt(scanner, "Ingrese codigo de pais buscado.");
			for (DestinoTuristico destinoTuristico : destinos) {
				if (destinoTuristico.getPais().getCodigo() == codigoBuscado) {
					System.out.println(destinoTuristico);
				}
			}
		}
	}

	private static void mostrarDestinosTuristicosOrdenadosNombre(ArrayList<DestinoTuristico> destinos) {
		if (destinos.isEmpty()) {
			System.out.println("La Lista de destinos esta vacia");
		}else {
			destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
			destinos.forEach(des -> System.out.println(des));
		}
	}

	private static void eliminarDestinoTuristico(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
		if (destinos.isEmpty()) {
			 System.out.println("La lista de destinos esta vacia.");
		}else {
			boolean eliminadoEncontrado = false;
			int codigoDeDestino = verificarEntradaDeDatoInt(scanner, "Ingrese un codigo de destino para eliminar: ");
			Iterator<DestinoTuristico> iterator = destinos.iterator();
			while (iterator.hasNext()) {
				DestinoTuristico destinoTuristico = (DestinoTuristico) iterator.next();
				if (destinoTuristico.getCodigo() == codigoDeDestino) {
					iterator.remove();
					eliminadoEncontrado = true;
					System.out.println("Se elimino el destino turistico.");
				}
			}
			if (!eliminadoEncontrado) {
				System.out.println("No se encontro el destino turistico");
			}
		}
	}

	private static void modificarPaisDeDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
		int codigo = verificarEntradaDeDatoInt(scanner, "Para modificar el pais ingrese los datos del destino turistico" + "\n" + "Codigo del destino: ");
		boolean noEncontrado = true;
		int indiceDestino = 0;
		int indicePais = 0;
		for (DestinoTuristico destinoTuristico : destinos) {
			if (destinoTuristico.getCodigo() == codigo) {
				System.out.println("Destino encontrado. Ingrese cambio de pais:");
				int codigoDePaisIngresado = verificarEntradaDeDatoInt(scanner, "Ingrese codigo de pais: ");
				for (Pais pais : paises) {
					if (pais.getCodigo() == codigoDePaisIngresado) {
						break;
					}
					indicePais++;
				}
				if (indicePais < paises.size()) {
					destinos.get(indicePais).setPais(paises.get(indicePais));
					System.out.println("Pais modificado exitosamente.");
					noEncontrado = false;
					break;
				}
			}
			indiceDestino++;
		}
		if (noEncontrado) {
			System.out.println("No se encontro destino turistico con ese codigo o ingreso un codigo de pais erroneo. No se realizaron cambios.");
		}
	}

	private static void mostrarDestinosCargados(ArrayList<DestinoTuristico> destinos) {
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println(destinoTuristico);
		}
	}

	private static void mostrarPaisesCargados(ArrayList<Pais> paises) {
		for (Pais pais : paises) {
			System.out.println(pais);
		}
	}

	private static DestinoTuristico cargarDestino(ArrayList<Pais> paises, Scanner scanner) {
		DestinoTuristico destinoNuevo = new DestinoTuristico();
		System.out.println("Ingresar nuevo destino ");
		destinoNuevo.setCodigo(verificarEntradaDeDatoInt(scanner, "Ingrese codigo de destino: "));
		System.out.println("Ingrese nombre de destino: ");
		destinoNuevo.setNombre(scanner.next());
		destinoNuevo.setPrecio(verificarEntradaDeDatoInt(scanner, "Ingrese precio del destino: "));
		int codigoDePaisIngresado = verificarEntradaDeDatoInt(scanner, "Ingrese codigo de pais: ");
		int indice = 0;
		for (Pais pais : paises) {
			if (pais.getCodigo() == codigoDePaisIngresado) {
				break;
			}
			indice++;
		}
		if (indice < paises.size()) {
			destinoNuevo.setPais(paises.get(indice));
			destinoNuevo.setCantidadDeDias(verificarEntradaDeDatoInt(scanner, "Ingrese cantidad de dias: "));
		}
		return destinoNuevo;
	}

	public static void mostrarMenu() {
		System.out.println( "Menu: " + "\n" +
							"1 – Alta de destino turístico." + "\n" +
							"2 – Mostrar todos los destinos turísticos." + "\n" +
							"3 – Modificar el país de un destino turístico." + "\n" +
							"4 – Limpiar el ArrayList de destino turísticos." + "\n" +
							"5 – Eliminar un destino turístico." + "\n" +
							"6 – Mostrar los destinos turísticos ordenados por nombre." + "\n" +
							"7 – Mostrar todos los países." + "\n" +
							"8 – Mostrar los destinos turísticos que pertenecen a un país." + "\n" +
							"9 – Salir.");
	}

	private static void cargarPaises(ArrayList<Pais> paises) {
		paises.add(new Pais(32, "Argentina"));
	    paises.add(new Pais(76, "Brasil"));
	    paises.add(new Pais(68, "Bolivia"));
	    paises.add(new Pais(152, "Chile"));
	    paises.add(new Pais(170, "Colombia"));
	    paises.add(new Pais(600, "Paraguay"));
	    paises.add(new Pais(858, "Uruguay"));
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

}