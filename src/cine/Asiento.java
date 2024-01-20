package cine;


public class Asiento {
	
	private int columna;
	private boolean ocupado;
	private int fila;
	
	public Asiento() {
		
	}

	public Asiento(int columna, int fila) {
		this.columna = columna;
		this.ocupado = false;
		this.fila = fila;
	}
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		if(this.ocupado) {
			return "El asiento de la columna " + columna + " y fila  " + fila + " está ocupado.";
		}else {
			return "El asiento de la columna " + columna + " y fila  " + fila + " está libre.";
		}	
	}
}
