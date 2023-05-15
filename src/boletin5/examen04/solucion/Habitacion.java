package boletin5.examen04.solucion;

/**
 * Clase Habitacion: guarda los datos necesarios para crear un obj. habitacion.
 * 
 * @author MariaGM
 * @version 1
 */

public class Habitacion {
	private int numero;

	/**
	 * Constructor Habitacion
	 * 
	 * @param numero: numero de la habitacion a crear
	 */
	public Habitacion(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter atributo numero (Habitacion)
	 * 
	 * @return devuelve un int que es el numero de la habitacion solicitada
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter atributo numero (Habitacion)
	 * 
	 * @param numero: numero de la habitacion a setear
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * ToString Clase Habitacion
	 */
	public String toString() {
		return "habitación número " + this.numero;
	}

}
