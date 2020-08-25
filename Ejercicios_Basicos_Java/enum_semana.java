package Ejercicios_Basicos_Java;

import java.util.Scanner;

enum DiaSemana{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};

public class enum_semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dia;
		
		System.out.println("Introduce un dia de la semana:");
		dia = (new Scanner(System.in).nextLine()).toUpperCase();
		
		DiaSemana dia_semana = DiaSemana.valueOf(dia);
		
	
		switch(dia_semana)
		{
			case LUNES:
			case MARTES:
			case MIERCOLES:
			case JUEVES:
			case VIERNES:
				
				System.out.println("El dia es laborable");
				break;
			
			case SABADO:
			case DOMINGO:
				
				System.out.println("El dia no es laborable");
				break;
			
		}		
		
	}

}
