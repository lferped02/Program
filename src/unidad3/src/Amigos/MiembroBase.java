package Amigos;

import java.util.Arrays;
import java.util.Objects;

public abstract class MiembroBase {
	private int id;
	private String email;
	private String nombre;
	private int contadorAmigos;
	protected MiembroBase[] amigos;
	static int contadorIdentificador;

	public MiembroBase(int id, String email, String nombre) {
		super();
		this.id = id;
		this.email = email;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContadorAmigos() {
		return contadorAmigos;
	}

	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	public MiembroBase[] getAmigos() {
		return amigos;
	}

	public void setAmigos(MiembroBase[] amigos) {
		this.amigos = amigos;
	}

	public static int getContadorIdentificador() {
		return contadorIdentificador;
	}

	public static void setContadorIdentificador(int contadorIdentificador) {
		MiembroBase.contadorIdentificador = contadorIdentificador;

	}
	public static boolean idAmigos(){
		return false;
		
	}
	

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + ", contadorAmigos="
				+ contadorAmigos + ", amigos=" + Arrays.toString(amigos) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(amigos);
		result = prime * result + Objects.hash(contadorAmigos, email, id, nombre);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Arrays.equals(amigos, other.amigos) && contadorAmigos == other.contadorAmigos
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(nombre, other.nombre);
	}

	public String getTipoAmigos(String a) {
		return a;
	}

}
