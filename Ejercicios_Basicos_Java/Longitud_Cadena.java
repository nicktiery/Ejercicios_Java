package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Longitud_Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		String [] palabras;
	
		System.out.println("Introduzca una frase:");
		frase=(new Scanner(System.in).nextLine());
		
		palabras = frase.split(" ");
		
		for(int i=0; i<palabras.length;i++) 
		{
			System.out.println(palabras[i]);
		}
		
		//System.out.println(frase.substring(4,6));
		
		
		
	}

}
