package Segundotrimestre;

//variables
public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;

	// we need to create this vacio to not get error
	public Alumno() {
	}

	// with parametros (constructores)
	public Alumno(String nom, String ape, String dnei, int eda) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dnei;
		this.edad = eda;

	}

	// getter
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	// setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
