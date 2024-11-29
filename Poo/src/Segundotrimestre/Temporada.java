package Segundotrimestre;

public class Temporada {
	private int numero;
	private int capitulo;

	// we need to create this vacio to not get error
	public Temporada() {
	}

	// with parametros (constructores)
	public Temporada(int num, int cap) {
		this.numero = num;
		this.capitulo = cap;

	}

	// getter
	public int getNumero() {
		return numero;
	}

	public int getCapitulo() {
		return capitulo;
	}

	// setter

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}
}
