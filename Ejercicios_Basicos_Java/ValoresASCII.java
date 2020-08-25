package Ejercicios_Basicos_Java;

import java.util.*;

public class ValoresASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char caracter;
		int Ascii;
		
		System.out.println("Intrdouce un caracter: ");
		caracter= sc.next().charAt(0);
		
		Ascii=(int)caracter;
		
		System.out.println("El valor ASCII de tu caracter es: " + Ascii);
		
	}

}
