package Modelo;



//Agregamos más clases para hacer evidente el problema

public class Estudiante {

	public Estudiante(String nombre) {
		// TODO Auto-generated constructor stub
	}

	public String ejecutaAcciones() {
		return "Estudiante estudia";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}

}
