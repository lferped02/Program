package Controlador;

import Modelo.ElementosMultimedia;
import Modelo.Libro;
import Modelo.Pelicula;
import Modelo.VideoJuego;

public class GestionaBiblioteca {
	public static void main(String[] args) {
		Libro libro = new Libro(1, "Sala 1", "Libro 1", "Editorial 1", "Genero 1", 0);
		ElementosMultimedia elemento = (ElementosMultimedia) new Pelicula(2, "Sala 4", 140);
		ElementosMultimedia elemento2 = new VideoJuego(3, "Sala 2");
		
		System.out.println(libro.getDevuelveDiasPrestamo());
		System.out.println(elemento.estaDisponible());
		System.out.println(elemento2.toString());

	}

}
