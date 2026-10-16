import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero;
		
		System.out.println("Dime un número");
		numero = sc.nextInt();
		
		int resto = numero % 2;
	
		boolean comprobacion = resto == 0;
		
		System.out.println("¿Es par?: " + comprobacion);
		
		/* if (resto == 0) {
			System.out.println("El número es par.");
		} else {
			System.out.println("El número es impar.");
		} */
		
	}

}
