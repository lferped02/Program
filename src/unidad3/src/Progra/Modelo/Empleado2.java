package unidad3.src.Progra.Modelo;



public class Empleado2 implements IAcciones {

	@Override
	public String ejecutaAcciones() {
		return "Trabajador que trabaja";

	}

	@Override
	public String toString() {
		return ejecutaAcciones();
	}
}
