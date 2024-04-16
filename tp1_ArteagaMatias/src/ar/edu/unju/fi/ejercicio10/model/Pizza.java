package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	final int ADICIONAL_INGREDIENTES_ESPECIALES_20 = 500;
	final int ADICIONAL_INGREDIENTES_ESPECIALES_30 = 750;
	final int ADICIONAL_INGREDIENTES_ESPECIALES_40 = 1000;
	private Double diametro;
	private int precio;
	private Double area;
	private boolean ingredientesEspeciales;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	public void calcularPrecio() {
		if(diametro==20 && ingredientesEspeciales==false) {
			precio = 4500;
		}
		if(diametro==20 && ingredientesEspeciales) {
			precio = 4500 + ADICIONAL_INGREDIENTES_ESPECIALES_20;
		}
		if(diametro==30 && ingredientesEspeciales==false) {
			precio = 4800;
		}
		if(diametro==30 && ingredientesEspeciales) {
			precio = 4800 + ADICIONAL_INGREDIENTES_ESPECIALES_30;
		}
		if(diametro==40 && ingredientesEspeciales==false) {
			precio = 5500;
		}
		if(diametro==40 && ingredientesEspeciales) {
			precio = 5500 + ADICIONAL_INGREDIENTES_ESPECIALES_40;
		}
	}
	
	public void calcularArea() {
		Double radio = diametro/2;
		area = Math.PI * (radio * radio);
	}
	
	@Override
	public String toString() {
		return "Diametro = " + diametro + "\n"  + "IngredientesEspeciales = "
				+ ingredientesEspeciales + "\n" + "Precio Pizza = " + precio + "$" + "\n" + "Area de la pizza = " + area;
	}

	public Double getDiametro() {
		return diametro;
	}
	public void setDiametro(Double diametro) {
		this.diametro = diametro;
		calcularArea();
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
		calcularPrecio();
	}

}
