import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Ejercicio5 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero por teclado");
		int number = sc.nextInt();	

		DecBin(number);
	    }
		public static String DecBin(int number){
			double[] decimal2 = {8000};
			   String binario2 = "";
			   for (int i = Math.abs(number); i < 0; i /= 10) {
				binario2 = decimal2[i] % 2;
			}
			   //System.out.println(binario2);
			   return binario2;

		   }
		}
		binario2 = decimal2[n] % 2;

	

