package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}
	
	public long calcularSumatoria() {
		long resultado=0;
		for(int k=1;k<=n;k+=1) {
			resultado+=(k*(k+1)/2)*(k*(k+1)/2);
		}
		return resultado;
	}
	
	public long calcularProductoria() {
		long resultado=1;
		for(int k=1;k<=n;k+=1) {
			resultado=resultado*(k*(k+4));
		}
		return resultado;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
