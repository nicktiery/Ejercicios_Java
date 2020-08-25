package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Eliminacion_Espacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String frase;
		
		System.out.println("Introduzca una frase:");
		frase=(new Scanner(System.in).nextLine());
		
		System.out.println(frase.replaceAll(" ", ""));
		*/
		
		String frase;
		String frase_sin_espacios= "";
		char caracter =' ';
		
		System.out.println("Inserta una frase:");
		frase=(new Scanner(System.in).nextLine());
		
		for(int i=0;i<frase.length();i++) 
		{
			caracter=frase.charAt(i);
			
			if(caracter!=' ') 
			{
				frase_sin_espacios+=String.valueOf(caracter);
			}
		
		}
		
		System.out.println(frase_sin_espacios);
	}

}
