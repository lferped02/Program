package Examenprog;

public class GestionaRuta {

	public static void main(String[] args) {
		Ciudad ciudad = new Ciudad("Málaga", 500000);
		Ciudad ciudad2 = new Ciudad("Granada", 60000);
		Ciudad ciudad3 = new Ciudad("Sevilla", 900500);
		Ciudad ciudad4 = new Ciudad("Cordoba", 100000);
		Ciudad ciudad5 = new Ciudad("Jaen", 52000);

		System.out.println(ciudad.getCoste());
		System.out.println(ciudad2.getCoste());
		System.out.println(ciudad3.getCoste());
		System.out.println(ciudad4.getCoste());
		System.out.println(ciudad5.getCoste());

		RutaBase ruta = new RutaBase("1", "Malaga", "Jaen", 300);
		RutaBase ruta2 = new RutaBase("2", "Granada", "Sevilla", 250);
		RutaBase ruta3 = new RutaBase("3", "Cordoba", "Jaen", 155);
		RutaBase ruta4 = new RutaBase("4", "Jeen", "Malaga", 500);

		System.out.println(ruta.getCoste());
		System.out.println(ruta2.getCoste());
		System.out.println(ruta3.getCoste());
		System.out.println(ruta4.getCoste());
	}

}
