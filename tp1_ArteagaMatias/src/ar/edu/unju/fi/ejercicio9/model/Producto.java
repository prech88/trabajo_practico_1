package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private Float precio;
	private short descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Float calcularDescuento() {
		if(descuento==0) {
			return precio;
		}else {
			return precio-(precio*descuento/100);
		}
	}
	
	@Override
	public String toString() {
		return "Nombre del producto: " + nombre + "\n" + "Codigo del rpoducto: " + codigo + "\n" + "Precio del producto: " + precio + "\n" + "Descuento del producto: " + descuento;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCódigo() {
		return codigo;
	}
	public void setCódigo(int código) {
		this.codigo = código;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public short getDescuento() {
		return descuento;
	}
	public void setDescuento(short descuento) {
		this.descuento = descuento;
	}

}
