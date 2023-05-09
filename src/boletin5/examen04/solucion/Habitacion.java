package boletin5.examen04.solucion;

public class Habitacion {
	private int numero;

	public Habitacion(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "habitaci�n n�mero " + this.numero;
	}

}
