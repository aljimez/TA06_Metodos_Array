import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Ejercicio2 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad máxima de numeros aleatorios");
		int maxnumber = sc.nextInt();
		System.out.println("Introduce la cantidad minima de numeros aleatorios");
		int minnumber = sc.nextInt();
		
		Random rand = new Random(maxnumber+minnumber);
		 System.out.println("Numero generado: "+rand);
		 
	}
}
