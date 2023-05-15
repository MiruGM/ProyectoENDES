package boletin5.examen04.solucion;

/**
 * Clase Cliente: guarda los datos necesarios para crear un obj. cliente
 * 
 * @author MariaGM
 * @version 1
 */

public class Cliente {
	private String nombre;

	/**
	 * Constructor Cliente
	 * 
	 * @param nombre: nombre del cliente a crear
	 */
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter atributo nombre (Cliente)
	 * 
	 * @return devuelve un string con el nombre del cliente solicitado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter atributo nombre (Cliente)
	 * 
	 * @param nombre: nombre del cliente a setear
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * ToString de Clase Cliente
	 */
	public String toString() {
		return "cliente " + this.nombre;
	}

}
