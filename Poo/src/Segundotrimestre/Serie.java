package Segundotrimestre;

public class Serie {
	private String nombre;
	private String genero;
	private int temporadas;

	// we need to create this vacio to not get error
	public Serie() {
	}

	// with parametros (constructores)
	public Serie(String nom, String gen, int temp) {
		this.nombre = nom;
		this.genero = gen;
		this.temporadas = temp;

	}

	// getter
	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public int getTemporadas() {
		return temporadas;
	}

	// setter

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

}
