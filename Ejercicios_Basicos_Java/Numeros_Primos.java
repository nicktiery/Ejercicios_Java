package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Numeros_Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce un numero:");
		numero=sc.nextInt();
		
		if(numero<=1) 
		{
			System.out.println("El numero no es primo");
		}
		else 
		{
			int raiz = (int)Math.sqrt(numero);
			int contador = 0;
			
			for(int i=raiz; i>1; i--) 
			{
				if(numero%i==0) 
				{
					contador++;
				}
			}
			
			if(contador < 1) 
			{
				System.out.println("El numero es primo");
			}
			else 
			{
				System.out.println("El numero no es primo");
			}
		}	
	}

}
