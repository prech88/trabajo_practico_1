package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		String nombre;
		int codigo;
		Float precio;
		short descuento;
		Scanner scanner = new Scanner(System.in);
		
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Ingrese los datos del producto " + i + ":");
			System.out.println("Ingrese nombre del producto: ");
			nombre = scanner.next();
			System.out.println("Ingrese codigo del producto: ");
			codigo = scanner.nextInt();
			System.out.println("Ingrese precio del producto: ");
			precio = scanner.nextFloat();
			System.out.println("Ingrese descuento del producto: ");
			descuento = scanner.nextShort();
			if(i==1) {
				producto1.setNombre(nombre);
				producto1.setCódigo(codigo);
				producto1.setPrecio(precio);
				producto1.setDescuento(descuento);
			}
			if(i==2) {
				producto2.setNombre(nombre);
				producto2.setCódigo(codigo);
				producto2.setPrecio(precio);
				producto2.setDescuento(descuento);
			}
			if(i==3) {
				producto3.setNombre(nombre);
				producto3.setCódigo(codigo);
				producto3.setPrecio(precio);
				producto3.setDescuento(descuento);
			}
		}
		
		System.out.println(producto1);
		System.out.println("Precio con descuento: "+producto1.calcularDescuento());
		System.out.println("----------------------------------------------------");
	
		System.out.println(producto2);
		System.out.println("Precio con descuento: "+producto2.calcularDescuento());
		System.out.println("----------------------------------------------------");

		System.out.println(producto3);
		System.out.println("Precio con descuento: "+producto3.calcularDescuento());
		System.out.println("----------------------------------------------------");
		
		scanner.close();

	}

}
