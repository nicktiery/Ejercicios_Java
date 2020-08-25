package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Contraseña {
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String respuesta;
		String contraseña = "filosofia";
		int contador = 0;
		
		do 
		{
			System.out.print("Introduce una contraseña:");
			respuesta = sc.nextLine();
			
			if(respuesta.equals(contraseña)) 
			{
				System.out.println("Enhorabuena");
				
				return;
			}
			else 
			{
				contador++;
				
				if(contador==3) 
				{
					System.out.println("Acceso Denegado");
					
					return;
				}
			}
			
		}
		while(respuesta != contraseña);
	}

}
