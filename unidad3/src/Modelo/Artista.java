package Modelo;


//Agregamos otra clase con otro comportamiento
public class Artista  {
	public String ejecutaAcciones() {
		return "El pintor pinta";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}
