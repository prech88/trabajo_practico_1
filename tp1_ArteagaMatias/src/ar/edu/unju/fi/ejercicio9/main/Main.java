package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			Producto producto = new Producto();
			
			System.out.println("Ingrese los datos del producto " + i + ":");
			System.out.println("Ingrese nombre del producto: ");
			producto.setNombre(scanner.next());
			System.out.println("Ingrese codigo del producto: ");
			producto.setCódigo(scanner.nextInt());
			System.out.println("Ingrese precio del producto: ");
			producto.setPrecio(scanner.nextFloat());
			System.out.println("Ingrese descuento del producto (entre el 0 y 50): ");
			producto.setDescuento(scanner.nextShort());
			
			System.out.println(producto);
			System.out.println("Precio con descuento: "+producto.calcularDescuento());
			System.out.println("----------------------------------------------------");
			
		}
		
		scanner.close();

	}

}
