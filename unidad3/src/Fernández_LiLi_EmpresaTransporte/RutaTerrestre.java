package Fernández_LiLi_EmpresaTransporte;

public class RutaTerrestre extends RutaBase implements IRuta {

	public RutaTerrestre(String id, String ciudadOrigen, String ciudadDestino, float distanciaKms) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		// TODO Auto-generated constructor stub
	}

	public String siEsCarretera() {
		return null;

	}

	@Override
	public double getCoste() {
		double coste;
		coste = getdistancia() * 0.75;
		return coste;
	}

	private double getdistancia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipoRuta() {
		String RutaTerrestre = null;
		return RutaTerrestre;
	}

}
