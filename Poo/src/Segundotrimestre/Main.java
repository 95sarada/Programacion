package Segundotrimestre;

public class Main {
	public static void main(String[] args) {

		Pelicula pelicula1 = new Pelicula();
		Pelicula pelicula2 = new Pelicula();

		// Ingresar datos del pelicula1

		pelicula1.setNombre("Titanic");
		pelicula1.setGenero("Drama");
		pelicula1.setAnio(1997);
		pelicula1.setDuracion(180);
		pelicula1.setIdioma("English");

		// Mostrar datos del pelicula1

		System.out.println("Datos del pelicula1:");
		System.out.println("Nombre: " + pelicula1.getNombre());
		System.out.println("genero: " + pelicula1.getGenero());
		System.out.println("anio: " + pelicula1.getAnio());
		System.out.println("duracion: " + pelicula1.getDuracion());
		System.out.println("idioma : " + pelicula1.getIdioma());

		// Ingresar datos del pelicula2

		pelicula2.setNombre("Dune");
		pelicula2.setGenero("sci-fi");
		pelicula2.setAnio(2021);
		pelicula2.setDuracion(150);
		pelicula2.setIdioma("English");

		// Mostrar datos del pelicula2

		System.out.println("Datos del pelicula2:");
		System.out.println("Nombre: " + pelicula2.getNombre());
		System.out.println("genero: " + pelicula2.getGenero());
		System.out.println("anio: " + pelicula2.getAnio());
		System.out.println("duracion: " + pelicula2.getDuracion());
		System.out.println("idioma : " + pelicula2.getIdioma());

		Serie serie1 = new Serie();
		Serie serie2 = new Serie();

		// Ingresar datos del serie1

		serie1.setNombre("Money heist");
		serie1.setGenero("Drama");
		serie1.setTemporadas(5);

		// Mostrar datos del serie

		System.out.println("Datos del serie1:");
		System.out.println("Nombre: " + serie1.getNombre());
		System.out.println("genero: " + serie1.getGenero());
		System.out.println("temporadas: " + serie1.getTemporadas());

		// Ingresar datos del serie2

		serie2.setNombre("Squid game");
		serie2.setGenero("Thriller");
		serie2.setTemporadas(2);

		// Mostrar datos del serie2

		System.out.println("Datos del serie2:");
		System.out.println("Nombre: " + serie2.getNombre());
		System.out.println("genero: " + serie2.getGenero());
		System.out.println("temporadas: " + serie2.getTemporadas());

		Temporada temporada1 = new Temporada();

		// Ingresar datos del temporada1

		temporada1.setNumero(1);
		temporada1.setCapitulo(20);

		// Mostrar datos del temporada1
		System.out.println("Datos del temporada:");
		System.out.println("Numero: " + temporada1.getNumero());
		System.out.println("Capitulo: " + temporada1.getCapitulo());

		Capitulos capitulos1 = new Capitulos();

		// Ingresar datos del capitulos1

		capitulos1.setNumero(1);
		capitulos1.setDuracion(45);

		// Mostrar datos del capitulos1
		System.out.println("Datos del Capitulos:");
		System.out.println("Numero: " + capitulos1.getNumero());
		System.out.println("Duracion: " + capitulos1.getDuracion());
	}
}
