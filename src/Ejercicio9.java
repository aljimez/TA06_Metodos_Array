import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Random;
public class Ejercicio9 {
	public static  void main(String []args) {
//Introduce tamaño de array
	 int arr[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"))];
	//Pasar tamaño por parametro a funcion
	 randGen(arr);
	 showArr(arr);
	}
	
	//Generar numeros random
	 public static void randGen(int num[]) {
		Random rand = new Random();
		for(int i = 0;i<num.length;i++) {
			num [i] = rand.nextInt(10);
		}
	 }
	
	//Mostrar array
	 public static void showArr(int num[]) {
		 double resul = 0;
		 for(int i = 0; i< num.length;i++) {
		System.out.println("Indice "+i+" valor "+num[i]);
			 resul +=num[i];
		 }
	 System.out.println("suma de numeros "+resul);
	 }
}
