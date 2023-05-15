package boletin5.examen04.solucion;

/**
 * Clase Fecha: guarda los datos necesarios para crear un obj. fecha
 * 
 * @author MariaGM
 * @version 1
 */
public class Fecha {
	private int dia;
	private int mes;
	private int anyo;

	/**
	 * Constructor Fecha
	 * 
	 * @param dia dia de la fecha a crear
	 * @param mes mes de la fecha a crear
	 * @param anyo año de la fecha a crear
	 */
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Getter atributo dia (Fecha)
	 * 
	 * @return devuelve un int con el dia de la fecha solicitada
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Setter atributo dia (Fecha)
	 * 
	 * @param dia: dia de la fecha a setear
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Getter atributo mes (Fecha)
	 * 
	 * @return devuelve un int con el mes de la fecha solicitada
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Setter atributo mes (Fecha)
	 * 
	 * @param mes mes de la fecha a setear
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Getter atributo ano (Fecha)
	 * 
	 * @return devuelve un int con el año de la fecha solicitada
	 */
	public int getAnyo() {
		return anyo;
	}

	/**
	 * Setter atributo ano (Fecha)
	 * 
	 * @param anyo año de la fecha a setear
	 */
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	/**
	 * ToString de Clase Fecha
	 */
	@Override
	public String toString() {
		return "" + this.dia + "/" + this.mes + "/" + this.anyo;
	}

	/**
	 * HashCode de Clase Fecha
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	/**
	 * Equals de Clase Fecha
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (anyo != other.anyo)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	/**
	 * CompareTo de Clase Fecha
	 * 
	 * @param otra fecha a comprar
	 * @return devuelve un int con la respuesta de la comparacion.
	 */
	public int compareTo(Fecha otra) {
		int res = this.anyo - otra.anyo;

		if (res == 0)
			res = this.mes - otra.mes;
		if (res == 0)
			res = this.dia - otra.dia;

		return res;
	}

}
