package Fernández_LiLi_EmpresaTransporte;

public class Ciudad implements IRuta {
	protected String nombre;
	protected int numHabitantes;

	public Ciudad(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	@Override
	public double getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipoRuta() {
		// TODO Auto-generated method stub
		return null;
	}

}
