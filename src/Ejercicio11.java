import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
public class Ejercicio11 {

	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el tamaño del array por teclado");
	int number = sc.nextInt();
	int array1[] = new int [number];
	int array2[] = new int[number];
	multArr(array1,array2);
	Randeom rand = new Random();

	int array3[] = multArr(array1, array2);

	for (int i = 0;i < array1.length;i++) {	
		 	array1[i] = rand.nextInt;	
	}
	for (int i = 0; i< array1.length;i++) {
		for (int j = 0; j < array2.length;j++) {
			array2[i] = array1[i];
		}
	}
}
	public static int[] multArr (int array1[],int array2[]) {
		int array3[] = new int[array1.lenght];
		for (int i =0;i < array1.length;i++) {
		 array3[i] = array1[i]*array2[i]; 
		return array3;
		}
	}
	public static void mostrarArray(int array1[],int array2[],int array3[]){

		System.out.println("Array1: "+Arrays.toString(array)+ "Array2: "+Arrays.toString(array2)+ "Array3: "+Arrays.toString(array3));
	}
}
	
	
