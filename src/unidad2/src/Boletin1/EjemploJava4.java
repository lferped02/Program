package unidad2.src.Boletin1;

import java.util.Scanner;

public class EjemploJava4 {

	public static void main(String[] args) {
		System.out.println("Dame un numero:");
		Scanner miEscaner = new Scanner(System.in);
		int numero = miEscaner.nextInt();
		if (numero > 7) {
			System.out.println("es mayor que 7");
			System.out.println("Hola");
		} else {
			System.out.println("es menor que 7");
		}
	}
}
