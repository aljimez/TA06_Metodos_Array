import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Ejercicio4 {
	public static void main(String []args) {
				//Extraer el factorial del numero

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero por teclado");
		int number = sc.nextInt();
	int factorial = 0;
		//Calculo de factorial

		while(number !=0) {
			 factorial = number * number; number--; 
			 System.out.println(factorial);
			
		}
	}
}
