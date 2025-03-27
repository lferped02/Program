package unidad3.src.Listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		/* Añadir elemento */
		lista.add("Pedro");
		lista.add("David");
		lista.add("Miguel");
		lista.add("Antonio");

		/* Elimina elemento */ 
		lista.remove(1);

		for (String cadena : lista) {
			System.out.println(cadena);
		}

		System.out.println(lista.size());

	}

}
