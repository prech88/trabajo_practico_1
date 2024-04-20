package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private Integer codigo;
	private String nombre;
	private Integer precio;
	private Pais pais;
	private Integer cantidadDeDias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(Integer codigo, String nombre, Integer precio, Pais pais, Integer cantidadDeDias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantidadDeDias = cantidadDeDias;
	}

	@Override
	public String toString() {
		return "DestinoTuristico [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", pais=" + pais
				+ ", cantidadDeDias=" + cantidadDeDias + "]";
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

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Integer getCantidadDeDias() {
		return cantidadDeDias;
	}

	public void setCantidadDeDias(Integer cantidadDeDias) {
		this.cantidadDeDias = cantidadDeDias;
	}
	
}
