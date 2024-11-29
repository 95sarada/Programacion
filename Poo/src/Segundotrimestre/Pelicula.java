package Segundotrimestre;

public class Pelicula {
	private String nombre;
	private String genero;
	private int anio;
	private int duracion;
	private String idioma;

	// we need to create this vacio to not get error
	public Pelicula() {
	}

	// with parametros (constructores)
	public Pelicula(String nom, String gen, int ani, int dura, String idi) {
		this.nombre = nom;
		this.genero = gen;
		this.anio = ani;
		this.duracion = dura;
		this.idioma = idi;
	}

	// getter
	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public int getAnio() {
		return anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getIdioma() {
		return idioma;
	}

	// setter

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
