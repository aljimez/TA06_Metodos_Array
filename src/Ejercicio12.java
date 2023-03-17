import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ejercicio12 {
	
	public static void main(String []args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce tamaño por teclado");
	int number = sc.nextInt();
	
	int array1[] = new int [number];
	rellArr(array1);
mostrarArray(array1,numFinal);
	}
//Llenamos el array con valores random
	public static void rellArr( int array[]){
	Random rad = new Random();
	for (int i = 0; i < array.length; i++) {
		array1[i] = claseRandom.nextInt(300);
	}
		
	}
			//Funcion para mstrar array por pantalla

public static void mostrarArray(int array[], int numFinal){

int i = 0;
for (int j = 0; j < array.length; j++) {
	
	if (array[j] % 10 == numFinal) {
		System.out.println("Array: "+Arrays.toString(array)+"sus numeros acaban en: "+numfinal+ "son "+array[i]);
		i++;
	}
	if (contador == 0) {
		System.out.println("Ninguno que acabe en "+numFinal);
		
	}
}

}

}
