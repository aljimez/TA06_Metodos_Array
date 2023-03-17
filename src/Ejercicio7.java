import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String []args,int eur) {
		eur = 20;
//Cambiar divisa de euro a libra

		String divis = "libra";  
		double tasa = 0.86;
		double monedafinal = eur*tasa ;
		System.out.println(monedafinal);
	}
}

