package cine;

public class ProcesadorPagos {
	private static final int PRECIO_ENTRADA = 100;
	private Cine cine;

	
	public ProcesadorPagos(Cine cine) {
		this.cine = cine;
	}

	public int getPrecioEntrada() {
		return PRECIO_ENTRADA;
	}
	
	
	public boolean procesarPago(String cuentaCliente, int fondosCliente) {
		System.out.println("Verificando saldo del cliente de la cuenta "+ cuentaCliente + ": " + fondosCliente);
		if(fondosCliente < PRECIO_ENTRADA) {
			System.out.println("Pago rechazado por no tener saldo suficiente: " + cuentaCliente);
			return false;
		}else {
			System.out.println("Pago realizado: " + cuentaCliente);
			cine.agregarRecaudación(PRECIO_ENTRADA);
			return true;
		}
	}
	
	
}
