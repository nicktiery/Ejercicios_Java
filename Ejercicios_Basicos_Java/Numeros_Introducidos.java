package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class Numeros_Introducidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, contador = 0;
		
		do {
			
			System.out.println("Introduce un numero:");
			numero=(new Scanner(System.in).nextInt());
			
			contador++;
			
		}while(!(numero==-1));
		
		System.out.println(contador-1);
		
	}

}
