package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Convertir_Letras_MAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		String opcion;
		
		System.out.println("Introduzca una frase:");
		frase=(new Scanner(System.in).nextLine());
		
		
		while(!(frase.isEmpty()))
		{
		System.out.println("Quieres convertir la frase en: ");
		opcion=(new Scanner(System.in).nextLine());
		
		switch(opcion)
		{
		
		case "MAYUSCULAS":
		case "Mayusculas":
		case "mayusculas":
			
			System.out.println(frase.toUpperCase());
			
			break;
			
		case "MINUSCULAS":
		case "Minusculas":
		case "minusculas":
			
			System.out.println(frase.toLowerCase());
			
			break;
			
			default:
				
			System.out.println("Escoge entre mayusculas o minusculas");
		}
		
		}
		
	}

}
