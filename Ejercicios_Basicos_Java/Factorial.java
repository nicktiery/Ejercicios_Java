package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int resultado = 0;
		
		System.out.println("Introduce un numero:");
		numero=(new Scanner(System.in).nextInt());
		
		
		if(numero>1) 
		{
			for(int i=0;i<=numero;i++) 
			{
				resultado+=i;
			}
			
			System.out.println(resultado);
		}
		else 
		{
			System.out.println("Introduce un numero válido");
		}
		
	}

}
