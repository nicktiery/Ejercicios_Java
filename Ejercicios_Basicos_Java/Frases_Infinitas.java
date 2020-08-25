package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Frases_Infinitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		String frase_completa ="";
		
		do 
		{
			System.out.println("Introduce una frase:");
			frase = (new Scanner(System.in).nextLine());
			
			frase_completa=frase_completa.concat(frase + " ");
			
		}while(!(frase.equals("")));
		
		System.out.println(frase_completa);
	
	}

}
