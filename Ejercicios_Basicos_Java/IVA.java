package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class IVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un precio:");
		double precio = entrada.nextDouble();
		final double iva = (precio*21)/100;
		
		System.out.println("El precio con iva es de: " + (precio+iva));
		
		
	}

}
