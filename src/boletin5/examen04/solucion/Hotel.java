package boletin5.examen04.solucion;

/**
 * Clase Hotel: guarda los datos necesarios para crear un obj. hotel
 * 
 * @author MariaGM
 * @version 1
 */
public class Hotel {
	private Reserva tReservas[];
	private Cliente tClientes[];
	private Habitacion tHabitaciones[];

	/**
	 * Constructor Hotel
	 */
	public Hotel() {
		this.tClientes = new Cliente[0];
		this.tHabitaciones = new Habitacion[0];
		this.tReservas = new Reserva[0];
	}

	/**
	 * Metodo para anadir clientes al array de clientes.
	 * 
	 * @param cliente: cliente a anadir a la tabla cliente. 
	 */
	public void anyadeCliente(Cliente cliente) {
		Cliente tNueva[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			tNueva[i] = this.tClientes[i];
		tNueva[this.tClientes.length] = cliente;
		this.tClientes = tNueva;
	}

	/**
	 * Metodo para anadir habitaciones al array de habitaciones.
	 * 
	 * @param habitacion a anadir al array de habitaciones.
	 */
	public void anyadeHabitacion(Habitacion habitacion) {
		Habitacion tNueva[] = new Habitacion[this.tHabitaciones.length + 1];
		for (int i = 0; i < this.tHabitaciones.length; i++)
			tNueva[i] = this.tHabitaciones[i];
		tNueva[this.tHabitaciones.length] = habitacion;
		this.tHabitaciones = tNueva;
	}

	/**
	 * Metodo para anadir reservas al array de reservas.
	 * 
	 * @param reserva a anadir al array de reservas
	 */
	public void anyadeReserva(Reserva reserva) {
		Reserva tNueva[] = new Reserva[this.tReservas.length + 1];
		for (int i = 0; i < this.tReservas.length; i++)
			tNueva[i] = this.tReservas[i];
		tNueva[this.tReservas.length] = reserva;
		this.tReservas = tNueva;
	}

	/**
	 * Metodo para obtener un array con las reservas de la habitacion pasada por
	 * parametro.
	 * 
	 * @param habitacion de las que se buscaran las reservas
	 * @return un array de reservas de la habitacion pasada por parametro
	 */
	// a)
	public Reserva[] getReservasDeHabitacion(Habitacion habitacion) {
		Hotel otro = new Hotel();
		for (Reserva r : this.tReservas) {
			if (r.getHabitacion().getNumero() == habitacion.getNumero()) {
				otro.anyadeReserva(r);
			}
		}
		return otro.tReservas;
	}

	/**
	 * Metodo para obtener un array de habitaciones que estan ocupadas el dia pasado
	 * por parametro.
	 * 
	 * @param fecha en la que se quiere saber que habitaciones estan ocupadas
	 * @return array de habitaciones con las habitaciones ocupadas en la fecha pasada por parametro
	 */
	// b)
	public Habitacion[] habitacionesOcupadasElDia(Fecha fecha) {
		Hotel otro = new Hotel();

		for (Reserva r : this.tReservas) {
			if (r.getFechaInicio().compareTo(fecha) <= 0 && r.getFechaFin().compareTo(fecha) >= 0) {
				otro.anyadeHabitacion(r.getHabitacion());
			}
		}
		return otro.tHabitaciones;
	}

	/**
	 * Metodo que devuelve un booleano indicando si la habitacion pasada por
	 * parametro esta disponible en las fechas de inicio y fin pasadas por
	 * parametro.
	 * 
	 * @param habitacion de la que se quiere comprobar si esta disponible
	 * @param inicio fecha de inicio a comprobar
	 * @param fin fecha de fin a comprobar
	 * @return booleano indiciando si la habitacion esta disponible o no
	 */
	// c)
	public boolean habitacionDisponible(Habitacion habitacion, Fecha inicio, Fecha fin) {
		for (Reserva r : this.getReservasDeHabitacion(habitacion))
			if (r.getFechaFin().compareTo(inicio) >= 0 && fin.compareTo(r.getFechaInicio()) >= 0)
				return false;

		return true;
	}

	/**
	 * Metodo que devuelve un booleano indicando su hay errores en las reservas.
	 * 
	 * @return booleano indicando de si hay errores en las reservas
	 */
	// d)
	public boolean hayErroresEnReservas() {
		for (Habitacion h : this.tHabitaciones)
			for (Reserva r : this.getReservasDeHabitacion(h))
				for (Reserva s : this.getReservasDeHabitacion(h))
					if (!r.getCliente().getNombre().equals(s.getCliente().getNombre())
							&& r.getFechaFin().compareTo(s.getFechaInicio()) >= 0
							&& s.getFechaFin().compareTo(r.getFechaInicio()) >= 0)
						return true;

		return false;
	}

}
