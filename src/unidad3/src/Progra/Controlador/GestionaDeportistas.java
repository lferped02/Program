package unidad3.src.Progra.Controlador;

import java.time.LocalDate;

import unidad3.src.Progra.Modelo.Prueba;


public class GestionaDeportistas {
	public static void main(String[] args) {
		Prueba[]pruebas = new Prueba[50];
		
		Deportista corredor = new Corredor ("Juanki", "Rumania",69, 23541, 183);
		Prueba prueba = new Prueba ("Prueba1", "Sevilla", LocalDate.now().plusDays(1), EstadoPrueba.PLANIFICADA);
		Prueba prueba1 = new Prueba ("Prueba2", "VillaVerde", LocalDate.now().plusDays(10), EstadoPrueba.PLANIFICADA);
		pruebas[0]=prueba;
		pruebas[1]=prueba1;
		corredor.setPruebas(prueba);
		System.out.println(corredor.getpruebaMasCercana());
		
	}

}
