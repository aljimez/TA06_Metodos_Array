import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio10 {
	public static void main(String []args) {
		 int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		 int array1 [] = new int[num1];
		 randGen(array1);
		 Genprimo(num1);
		 numeroMayor(array1);
		 
	}
	public static void randGen(int array1[]) {
		 int num1 = Integer.parseInt(JOptionPane.showInputDialog("Hasta que numero quieres generar los numeros random"));
		Random rand = new Random();
		for(int i = 0;i<array1.length;i++) {
			array1 [i] = rand.nextInt(num1);
			if(Genprimo(num1) == true) {
				array1[i] = num1;
			}else {
				i--;
			}
		}
	 }
	public static boolean Genprimo(int num1) {
		int i  = 2;
		boolean res = true;
		if((res) && (i != num1)) {
			if(num1 % i == 0) {
				
				res = false;
			}
		}
		return res;
	}
	public static void numeroMayor(int array[]) {
		int nMay = 0;
		for( int i =0;i<array.length;i++) {
			nMay = Math.max(nMay, array[i]);	
		}
		System.out.println("Primo mayor"+ nMay);
	}
	public static void mostrarArray(int array[]) {
		for(int i = 0;i<array.length;i++) {
			
			System.out.println("Indice "+ i + " valor " + array[i]);

		}
		
	}	
}