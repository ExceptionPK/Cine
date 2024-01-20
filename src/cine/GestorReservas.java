package cine;

public class GestorReservas {
	private Cine cine;
	private ProcesadorPagos pg;
	
	public GestorReservas(Cine cine, ProcesadorPagos pg) {
		this.cine = cine;
		this.pg = pg;
	}
	
	public void procesarReserva(Cliente cliente, int fila, int columna){
		if(pg.procesarPago(cliente.getCuentaBancaria(), cliente.getFondos())) {
			cliente.setFondos(cliente.getFondos() - pg.getPrecioEntrada());
			cine.reservarAsiento(fila, columna);
			System.out.println(cliente.getNombre() + " "+cliente.getApellidos() + " ha hecho una reserva");
		}else {
			System.out.println("La reserva de "+cliente.getNombre()+" "+cliente.getApellidos()+" ha sido rechazada");
		}
	}

	public Cine getCine() {
		return cine;
	}
	
	
	public synchronized void intentarReservar(Cliente cliente, int filaDeseada, int columnaDeseada) {
		System.out.println(cliente.getNombre() + " " +cliente.getApellidos()+" reserva el asiento de la columna " + columnaDeseada + " y fila " + filaDeseada);
		System.out.println("Correo: " + cliente.getCorreo() + " Cuenta de banco: " + cliente.getCuentaBancaria());
		
		if(cine.verificarDisponibilidad(filaDeseada, columnaDeseada)) {
			procesarReserva(cliente, filaDeseada, columnaDeseada);
		}
	}
	
	
	
}
