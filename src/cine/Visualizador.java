package cine;


public class Visualizador implements Runnable{
	private Cine cine;
	
	public Visualizador(Cine cine) {
		this.cine = cine;
	}
	
	
	public void EstadoAsientos() {
		Asiento[][] asientos = cine.getAsientos();
		for(int fila = 0; fila < cine.getnFilas(); fila++) {
			for(int columna = 0; columna < cine.getnColumnas(); columna++) {
				if(asientos[fila][columna].isOcupado()) {
					System.out.print("|X|");
				}else{
					System.out.print("|O|");
				}
			}
			System.out.print("\n");
		}
	}
	

	@Override
	public void run() {
		while(true) {
			synchronized (cine) {
				try {
					cine.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				EstadoAsientos();
			}
		}
	}
	
	
}
