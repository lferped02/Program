package Fernández_LiLi_EmpresaTransporte;

public class RutaBase extends Ciudad {
	private static int numHabitantes;
	private String id;
	private String ciudadOrigen;
	private String ciudadDestino;
	private float distanciaKms;

	public RutaBase(String id, String ciudadOrigen, String ciudadDestino, float distanciaKms) {
		super(ciudadDestino, numHabitantes);
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distanciaKms = distanciaKms;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public float getDistanciaKms() {
		return distanciaKms;
	}

	public void setDistanciaKms(float distanciaKms) {
		this.distanciaKms = distanciaKms;
	}

}
