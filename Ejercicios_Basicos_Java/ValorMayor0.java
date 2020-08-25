package Ejercicios_Basicos_Java;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ValorMayor0 {
	
	public static void main (String[] args) 
	{
		String sc;
		int numero;
		
		do 
		{
			sc=JOptionPane.showInputDialog("Introduce un numero");
			numero=Integer.parseInt(sc);
			
		}while(!(numero>=0));
	}
}
