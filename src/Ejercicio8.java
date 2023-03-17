import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String []args) {
				//Creación de los array

		Scanner sc = new Scanner(System.in);

		int array1[] = new int [10];
		
		for(int i = 0; i < array1.length;i++) {
			
			System.out.println("Introduce numero por teclado");
			array1[i] = sc.nextInt();
		
		}
		
	}
		//Metodo para imprimir los valores del array

	public static void mostrarArray(int array1[]) {
		
		for(int i = 0; i < array1.length;i++) {
			
			System.out.println(array1[i]);
			
		}
		
		
	
	}

}