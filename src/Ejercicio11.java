import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class Ejercicio11 {
//Establecemos el tamaño del array 
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el tamaño del array por teclado");
	int number = sc.nextInt();
	int array1[] = new int [number];
	int array2[] = new int[number];
	Random rand = new Random();
	int array3[] = multArr(array1, array2);
	calculos(array1,array2);

	mostrarArray(array1,array2,array3);
	}
	public static void calculos(int array1[],int array2[]) {
//Asociamos los valores de un array a otro
Random rnd = new Random();

	for (int i = 0;i < array1.length;i++) {	
		array1[i] = rnd.nextInt(10);	
	}
	for (int i = 0; i< array1.length;i++) {
			array2[i] = rnd.nextInt(10);
		
	}
}
//Multiplicar los valores de array1 y 2 para obtener los datos del array3
	public static int[] multArr ( int array1[], int array2[]) {
		 int array3[] = new int[array1.length];
		for (int i =0;i < array3.length;i++) {
		 array3[i] = array1[i]*array2[i]; 
		}
		return array3;

	}
		//Funcion para mstrar array por pantalla

	public static void mostrarArray(int array1[],int array2[],int array3[]){

		System.out.println("Array1: "+Arrays.toString(array1)+ "Array2: "+Arrays.toString(array2)+ "Array3: "+Arrays.toString(array3));
	}
}

	
