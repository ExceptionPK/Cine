# Cine
1. Clase Asiento: Representa un asiento individual dentro del cine, con información de su ubicación (fila y
columna) y si está ocupado. Se deben incluir métodos para obtener y modificar estos datos.

2. Clase Cine: Modela el cine que contiene una matriz de asientos. Esta clase debe ser capaz de verificar la
disponibilidad de los asientos, gestionar las reservas, comprobar si el cine está completo, manejar la recaudación total de las ventas y reiniciar los asientos cuando sea necesario.

3. Clase Cliente: Cada cliente, ejecutándose como un hilo independiente, intentará reservar un asiento
específico en el cine y tendrá información personal y bancaria.

4. Clase ProcesadorPagos: Se encargará de simular el proceso de pago, realizando transferencias
bancarias desde la cuenta del cliente a la del cine.

5. Clase GestorReservas: Funciona como intermediario entre el cliente y el sistema del cine. Esta clase
verifica la disponibilidad de asientos, gestiona el proceso de pago y, en caso de que un asiento esté
ocupado, busca el asiento alternativo más cercano disponible.

6. Clase Visualizador: Un hilo que muestra el estado actual de los asientos en el cine y se actualiza cada
vez que se realiza una reserva.

7. Clase Main: Inicia y controla la simulación. Esta clase crea y gestiona hilos para los clientes y el
visualizador, y se encarga del flujo continuo de la simulación.
