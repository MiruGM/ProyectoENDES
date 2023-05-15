package boletin5.examen04.solucion;

/**
 * Clase Reserva: guarda un cliente, una habitacion, una fecha de inicio y una
 * fecha de fin.
 * 
 * @author MariaGM
 * @version 1
 */

public class Reserva {
	private Cliente cliente;
	private Habitacion habitacion;
	private Fecha fechaInicio;
	private Fecha fechaFin;

	/**
	 * Constructor Reserva
	 * 
	 * @param cliente del que se va a crear la reserva
	 * @param habitacion que se va a reservar
	 * @param fechaInicio en la que el cliente reserva la habitacion
	 * @param fechaFin en la que termina la reserva del cliente en la habitacion
	 */
	public Reserva(Cliente cliente, Habitacion habitacion, Fecha fechaInicio, Fecha fechaFin) {
		this.cliente = cliente;
		this.habitacion = habitacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	/**
	 * Getter atributo cliente (Reserva)
	 * 
	 * @return devuelve el cliente de la reserva
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Setter atributo cliente (Reserva)
	 * 
	 * @param cliente setea el cliente de la reserva
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Getter atributo habitacion (Reserva)
	 * 
	 * @return devuelve la habitacion de la reserva
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}

	/**
	 * Setter atributo habitacion (Reserva)
	 * 
	 * @param habitacion setea la habitacion de la reserva
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	/**
	 * Getter atributo fechaInicio (Reserva)
	 * 
	 * @return devuelve fecha de inicio de la reserva
	 */
	public Fecha getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * Setter atributo fechaInicio (Reserva)
	 * 
	 * @param fechaInicio setea la fecha de inicio de la reserva
	 */
	public void setFechaInicio(Fecha fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * Getter atributo fechaFin (Reserva)
	 * 
	 * @return devuelve la fecha de fin de la reserva
	 */
	public Fecha getFechaFin() {
		return fechaFin;
	}

	/**
	 * Setter atributo fechaFin (Reserva)
	 * 
	 * @param fechaFin setea la fecha de fin de la reserva
	 */
	public void setFechaFin(Fecha fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * ToString Reserva
	 */
	@Override
	public String toString() {
		return "El " + this.cliente + " ha reservado la " + this.habitacion + " desde el " + this.fechaInicio
				+ " hasta el " + this.fechaFin;
	}

}
