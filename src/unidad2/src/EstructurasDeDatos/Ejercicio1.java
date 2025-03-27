package unidad2.src.EstructurasDeDatos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 r = new Ejercicio1();
		r.sumaCifras();
	}

	int sumaCifras() {
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		String numero1 = sc.next();
		System.out.println("Introduce el segundo número:");
		int numero2 = sc.nextInt();
		if (datosValidos(numero1, numero2)) {

			for (int i = 0; i < numero2; i++) {

			 String cifra = Character.toString(numero1.charAt(i));
			 int numeroCifra = Integer.parseInt(cifra);
			 resultado = resultado + numeroCifra;
			}
		}
		return resultado;

	}

	boolean datosValidos(String numero1, int numero2) {
		boolean valido = false;
		if (numero2<numero1.length()) {
			valido = true;
		}
		return valido;
	}
}
