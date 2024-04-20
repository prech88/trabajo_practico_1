package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	private Integer codigo;
	private String nombre;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}

	public Pais(Integer codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " codigo: " + codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
