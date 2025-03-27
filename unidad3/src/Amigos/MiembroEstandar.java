package Amigos;

public class MiembroEstandar extends MiembroBase {
	static int maximoAmigo;

	public MiembroEstandar(int id, String email, String nombre, int maximoAmigo) {
		super(id, email, nombre);
		this.maximoAmigo = 50;
	}

	public int getMaximoAmigo() {
		return maximoAmigo;
	}

	public void setMaximoAmigo(int maximoAmigo) {
		this.maximoAmigo = maximoAmigo;
	}

	public String getTipoUsuario() {
		return null;

	}

	@Override
	public String toString() {
		return "MiembroEstandar [maximoAmigo=" + maximoAmigo + "]";
	}

}
