package Examenprog;

public class RutaArea extends RutaBase implements IRuta {

	public RutaArea(String id, String ciudadOrigen, String ciudadDestino, float distanciaKms) {
		super(id, ciudadOrigen, ciudadDestino, distanciaKms);
		// TODO Auto-generated constructor stub

	}

	@Override
	public double getCoste() {
		double coste = 0;
		if (getdistancia().equals (TipoVuelo.LOW_COST)) {
			coste = getDistanciaKms()*0.75;
		}
		if(getdistancia().equals (TipoVuelo.NORMAL)){
			coste = getDistanciaKms()*1.1;
		}
		if(getdistancia().equals(TipoVuelo.EXPRESS)) {
			coste =getDistanciaKms()*1.5;
		}
		return coste;
	}

	private Object getdistancia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipoRuta() {
		String TipoVuelo = null;
		// TODO Auto-generated method stub
		return TipoVuelo;

	}

}
