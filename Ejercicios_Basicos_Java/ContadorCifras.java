package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class ContadorCifras {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cifra:");
		int numero = sc.nextInt();
		String respuesta = String.valueOf(numero);
		int contador=0;
		
		for(int i=1; i<=respuesta.length(); i++) 
		{	
			contador++;			
		}
		
		System.out.println(contador);
	}

}
