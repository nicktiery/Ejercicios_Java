package Ejercicios_Basicos_Java;

public class Numeros_1_a_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int i = 0;
		
		while(i<=99) 
		{
			i++;
			System.out.println(i);
		}
		*/
		
		for(int i = 0; i <= 100; i++) 
		{
			if(i%2==0 && i%3==0) 
			{
				System.out.println(i);
			}
			
		}
	}

}
