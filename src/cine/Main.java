package cine;

public class Main {

	public static void main(String[] args) {
		
		 Cine cine = new Cine(generarCuentas("cine"));
		 
		 Visualizador v = new Visualizador(cine);
		 
		 ProcesadorPagos pg = new ProcesadorPagos(cine);
		 
		 GestorReservas gr = new GestorReservas(cine, pg);
		 
		 
		 
		 Thread th = new Thread(v);
		 
		 th.start();
		 
		 
		
		 while(true) {
			 String nombre = nombreAleatorio();
			 String apellido = apellidoAleatorio();
			 Cliente c = new Cliente(nombre,apellido,generarCorreo(nombre,apellido),generarCuentas(nombre),generarFondos(), generarFila(cine.getnFilas()), generarColumna(cine.getnColumnas()),gr);
			 
			 th = new Thread(c);
			 th.start();
			 try {
				
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(cine.estaLleno()) {
				System.out.println("Se ha conseguido una suma total de " + cine.getRecaudacionTotal() + "€");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Error en el proceso.");
				}
				
			}
		 }
	}
	
	
	public static String generarCorreo(String nombre, String apellido) {
		return nombre + apellido + "@hotmail.com";
	}
	
	public static int generarFondos() {
		int numero = (int) Math.floor(Math.random() * 1000);
		return numero;
	}
	
	public static int generarFila(int Fila) {
		int numero = (int) Math.floor(Math.random() * Fila);
		return numero;
	}
	
	public static int generarColumna(int Columna) {
		int numero = (int) Math.floor(Math.random() * Columna);
		return numero;
	}
	
	public static String generarCuentas(String nombre) {
		String cuenta = "";
		for(int i = 0; i < nombre.length(); i++) {
			int caracter = nombre.charAt(i);
			String caracteres = String.valueOf(caracter);
			cuenta += caracteres;
		}
		return cuenta+nombre.charAt(0);
	}
	
	public static String nombreAleatorio() {
		 String[] nombres = { "David", "Alejandro", "Henry", "Victor", "Pablo", "Alfonso", "Juan", "Raul", "Sofía", "Adrián"};
		 int numero = (int) Math.floor(Math.random()*10);
		 return nombres[numero];
	}
	
	public static String apellidoAleatorio() {
		 String[] apellidos = {"Rojas", "Sanchez", "XD", "Sanchez", "Kuzmin", "Javier", "Andrés", "Portillo", "Meddah", "Tellez"};
		 int numero = (int) Math.floor(Math.random()*10);
		 return apellidos[numero];
	}
	
}
