package Modelo;

import java.util.Iterator;

public abstract class ElementosMultimedia extends Recurso {
	private String nombre;
	private String genero;
	private int diasPrestamo;

	public ElementosMultimedia(int id, String ubicacion) {
		super(id, ubicacion);
		// TODO Auto-generated constructor stub

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}

	public int getDevuelveDiasPrestamo() {
		// TODO Auto-generated method stub
		return this.getDiasPrestamo();
	}

	public abstract int duracion();

	public abstract boolean estaDisponible();

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}