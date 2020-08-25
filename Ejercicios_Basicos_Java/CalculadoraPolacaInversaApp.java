package Ejercicios_Basicos_Java;

import java.util.Scanner;

public class CalculadoraPolacaInversaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op1, op2;
		String signo;
		
		System.out.print("Introduce un operando:");
		op1=new Scanner(System.in).nextInt();
		
		System.out.print("Introduce un operando:");
		op2=new Scanner(System.in).nextInt();
		
		System.out.print("Introduce un signo:");
		signo=new Scanner(System.in).nextLine();
		
		if(signo.equalsIgnoreCase("+")) 
		{
			System.out.print(op1 + op2);
		}
		else if(signo.equalsIgnoreCase("-")) 
		{
			System.out.print(op1 - op2);
		}
		else if(signo.equalsIgnoreCase("*")) 
		{
			System.out.print(op1 * op2);
		}
		else if(signo.equalsIgnoreCase("/")) 
		{
			System.out.print(op1 / op2);
		}
		else if(signo.equalsIgnoreCase(":"))
		{
			System.out.print(Math.pow(op1, op2));
		}
		else if(signo.equalsIgnoreCase("%")) 
		{
			System.out.print(op1 % op2);
		}
		else 
		{
			System.out.print("Introduce un signo válido");
		}
	}

}
