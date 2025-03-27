package Amigos;

public class MiembroPremium extends MiembroBase {
	static int maximoAmigos;

	public MiembroPremium(int id, String email, String nombre, int[] maximoAmigos) {
		super(id, email, nombre);
		this.maximoAmigos = 100;

	}

	public int getMaximoAmigos() {
		return maximoAmigos;
	}

	public void setMaximoAmigos(int maximoAmigos) {
		this.maximoAmigos = maximoAmigos;

	}
	public String tipoPremium(){
		String miembro = null;
		
		return miembro;
		
	}

	@Override
	public String toString() {
		return "MiembroPremium [maximoAmigos=" + maximoAmigos + "]";
	}

}
