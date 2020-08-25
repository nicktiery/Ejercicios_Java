package Ejercicios_Basicos_Java;

import java.util.*;

public class NumeroVentas {

	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero de ventas");
		int ventas = sc.nextInt() - 1;
	
		int resultado = 0;
		int contador = 0;
		
		for(int i = 0; i<=ventas; i++) 
		{
			contador++;
			System.out.println("Venta: " + contador);
			int ventas2 = sc.nextInt();
			
			resultado=resultado+ventas2;
		}
		
		System.out.println("El total de ventas es: " + resultado);
		
	}
}
