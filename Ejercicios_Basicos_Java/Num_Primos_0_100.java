package Ejercicios_Basicos_Java;

public class Num_Primos_0_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0; i<=100; i++) 
		{
			int raiz=(int) Math.sqrt(i);
			int contador = 0;
			
			for(int j=raiz; j>1; j--) 
			{
				if(i%j==0) 
				{
					contador++;
				}
			}
			
			 if (contador<1){
	                System.out.println(i);
	            }
		
		}
	}

}
