package Modelo;

import java.time.LocalDate;

public class NAdador extends Deportista {

	public NAdador(String nombre, String pais, int edad, double peso, double altura) {
		super(nombre, pais, edad, peso, altura);
	}

	@Override
	public void competir() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTiempoCalentamiento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCaloriasNecesariasPorDia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHorasEntrenamiento(LocalDate fechaCompetencia) {
		// TODO Auto-generated method stub
		return 0;
	}

}
