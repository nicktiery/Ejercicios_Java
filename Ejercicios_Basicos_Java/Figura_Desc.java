package Ejercicios_Basicos_Java;

public class Figura_Desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char asterisco = '*';
		String cadena = "";
		
		/*
		for(int i=0;i<=5;i++) 
		{
			cadena+=String.valueOf(asterisco);
				
			System.out.println(cadena);
			
		}
		*/
		
		for(int i=5; i>=0; i--) 
		{	
			cadena+=String.valueOf(asterisco);
			
			System.out.println(cadena + i);
		}
		
	}

}
