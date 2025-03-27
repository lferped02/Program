package Controlador;

import java.util.Arrays;

import unidad3.src.Progra.Modelo.*;



public class GestionaCadenaAlimenticia {

	public static void main(String[] args) {

		Animal atacaSerpiente =  new Animal();
		Animal[] atacaRapaz = new Rapaz();
		Animal[] atacaRoedor = new Roedor();
		Animal[] atacaLeon = new Leon();

		Animal a = new Animal2("Cobra", Familia.serpiente, "Selva", atacaLeon, atacaRoedor);
		Animal a2 = new Rapaz("Aguila real", Familia.rapaz, "", null, null);
		Animal a4 = new Roedor("Conejo", Familia.roedor, "Campo", null, null);
		Animal a5 = new Leon("Leon", Familia.leon, "Amazona", null, null);

		System.out.println(Arrays.toString(a.getAnimalQueCome()));
		System.out.println(Arrays.toString(a.getAnimalComido()));
	}

}
