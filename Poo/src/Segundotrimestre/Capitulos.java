package Segundotrimestre;

public class Capitulos {
	private int numero;
	private int duracion;

	// we need to create this vacio to not get error
	public Capitulos() {
	}

	// with parametros (constructores)
	public Capitulos(int num, int cap) {
		this.numero = num;
		this.duracion = cap;

	}

	// getter
	public int getNumero() {
		return numero;
	}

	public int getDuracion() {
		return duracion;
	}

	// setter

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setDuracion(int capitulo) {
		this.duracion = capitulo;
	}
}
