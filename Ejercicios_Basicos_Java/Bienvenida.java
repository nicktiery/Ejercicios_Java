package Ejercicios_Basicos_Java;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bienvenida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		String apellido;
		String saludo;
		Scanner entrada = new Scanner(System.in);
		
		nombre=JOptionPane.showInputDialog("Introduce tu nombre:");
		
		System.out.println("Bienvenido " + nombre);
		
		System.out.println("Introduce tu apellido");
		apellido=entrada.nextLine();
		
		saludo=JOptionPane.showInputDialog("Bienvenido " + nombre + " " + apellido);
		
	}

}
