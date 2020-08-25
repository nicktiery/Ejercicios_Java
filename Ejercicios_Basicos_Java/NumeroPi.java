package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class NumeroPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String radio;
		double area;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el radio del circulo");
		radio=entrada.nextLine();
		Double.parseDouble(radio);
		
		area=Math.PI*Math.pow(Double.parseDouble(radio), 2);
		
		System.out.println("El area es: " + area);

		
		
		
	}

}
