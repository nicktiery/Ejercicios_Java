package Ejercicios_Basicos_Java;

public class Conteo_Vocales {
	
	public static void main (String[] args) 
	{
		String cadena = "La lluvia en sevilla es una maravilla";
		int contador = 0;
		int Ascii;
		
		for(int i=0; i<cadena.length(); i++) 
		{
			if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i'
					|| cadena.charAt(i)=='o' || cadena.charAt(i)=='u') 
			{
				contador++;	
			
			}
				
			System.out.print((int)cadena.charAt(i));
			
		}
		
		System.out.println(cadena.replace('a', 'e'));
		
		System.out.print("La cantidad de vocales es: " + contador);
			
	}

}
