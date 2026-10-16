import java.util.Scanner;

public class Comprobacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double numero;
		
		System.out.println("Dime un número:");
		numero = sc.nextDouble();
		
		boolean comprobar = numero >= 0;
		
		System.out.println("¿Es positivo?: " + comprobar);
		
		/* if (numero >= 0) {
			System.out.println("El número es positivo.");
		} else {
			System.out.println("El número es negativo.");
		} */
		
		sc.close();
	}

}
