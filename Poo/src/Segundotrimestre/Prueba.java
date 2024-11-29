package Segundotrimestre;

public class Prueba {
	public static void main(String[] args) {
		/*
		 * clase prueba --> main clase alumno
		 * 
		 * nombre - string apellidos - string dni - string edad - int
		 * 
		 * crear los getter crear los setter
		 * 
		 * hacemos llamadas desde la clase prueba
		 */

		// alumno objeto
		Alumno alumno = new Alumno();

		// Ingresa los datos de alumno
		alumno.setNombre("sarada");
		alumno.setApellido("Pokhrel");
		alumno.setDni("Y8148433F");
		alumno.setEdad(20);

		// mostrar los datos
		System.out.println("Datos del alumno:");
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("apellido: " + alumno.getApellido());
		System.out.println("dni: " + alumno.getDni());
		System.out.println("edad: " + alumno.getEdad());

	}
}
