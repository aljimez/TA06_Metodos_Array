import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Ejercicio3 {
	public static boolean main(String []args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce numero por teclado");
	int number = sc.nextInt();	
	//Extraer módulo de los valores introducidos
	if(number % number == 0 && number % 1 == 0) {
	
return true;	
	}else {
		System.out.println("El numero no es primo");
return false;
	}
	
}	
	
}
