import java.util.Scanner;

public class Ejercicio6 {

	public static int main(String []args,int number) {
		//INtroducir numero
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce numero por teclado");
	 number = sc.nextInt();
	 
	int contador = 0;
	//Cuenta de numero de cifras de un numero introducido por teclado
	 for (int i = Math.abs(number); i > 0; i /= 10) {
         contador++;
     }
	 return contador;

	}
}
