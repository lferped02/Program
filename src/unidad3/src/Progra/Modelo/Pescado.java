package unidad3.src.Progra.Modelo;

import java.time.LocalDate;
import java.util.Date;

import Fernández_LiLi_prueba.IAlimento;
import Progra.EjemploEnum.TipoDePescado;


public class Pescado extends Producto implements IAlimento {

	
	/*Constructor del padre*/
	public Pescado(int id, String nombre, String descripcion, int precio_venta) {
		super(id, nombre, descripcion, precio_venta);
		// TODO Auto-generated constructor stub
	}
	
	String origen;
	int peso;
	int tiempo_duracion;
	TipoDePescado nombre_pescado;
	LocalDate fecha_caducidad;
	static final int IVA= 7;
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param precio_venta
	 * @param iva
	 * @param origen
	 * @param peso
	 * @param tiempo_duracion
	 * @param nombre_pescado
	 *
	 */
	
	/*Constructor la clase / hijo*/
	
	public Pescado(int id, String nombre, String descripcion, int precio_venta,String origen, int peso,
			int tiempo_duracion, TipoDePescado nombre_pescado) {
		super(id, nombre, descripcion, precio_venta);
		this.origen = origen;
		this.peso = peso;
		this.tiempo_duracion = tiempo_duracion;
		this.nombre_pescado = nombre_pescado;
	}
	
	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		if(TipoDePescado.AZUL != null ) {
			return this.peso*3;
		}
		
		if(TipoDePescado.BLANCO != null) {
			return this.peso*2;
		}
		
		else
			return this.peso*1 ;
	}

	
	

	@Override
	public void setCaducidad(LocalDate fecha) {
		this.fecha_caducidad = fecha_caducidad;
		
	}

	@Override
	public LocalDate getCaducidad() {
		return fecha_caducidad;
	}

	
	
	
	
}
