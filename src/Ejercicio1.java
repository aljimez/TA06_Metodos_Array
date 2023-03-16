import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la figura a calcular");
	    String input = sc.nextLine();
		int res = 0;
	    switch(input) {
	    case "circulo":
	    	System.out.println("Introduce el radio del circulo a medir");
		    int radio = sc.nextInt();
		    double resul = Math.pow(radio,2)*Math.PI;
		    System.out.println("El area del circulo es: "+resul);
		    break;
	    case "triangulo":
	    	System.out.println("Introduce la base del triangulo");
		    int base = sc.nextInt();
		    System.out.println("Introduce la altura del triangulo a medir");
		    int alt = sc.nextInt();
		     res = base * alt /2;
			    System.out.println("El area del triangulo es: "+res);
		     break;
	    case "cuadrado":
	    	System.out.println("Introduce la medida de los lados");
		    int lado = sc.nextInt();
		     res = lado * lado;
			    System.out.println("El area del cuadrado es: "+res);

		     break;
	    }
	}
	
}
