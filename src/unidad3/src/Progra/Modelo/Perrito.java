package unidad3.src.Progra.Modelo;

import java.time.LocalDate;

public class Perrito extends Mascota {
	private String raza;
	private boolean pulgas;

	public Perrito(String nombre, int edad, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String muestra() {
		return "Perrito [raza=" + raza + ", pulgas=" + pulgas + ", muestra()=" + muestra() + "]";
	}

	@Override
	public String informacionCompleta() {
		return this.muestra();
	}

}
