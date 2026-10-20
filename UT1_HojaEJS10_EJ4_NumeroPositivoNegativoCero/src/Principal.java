import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double num;
		
		System.out.println("Dime un número");
		num = teclado.nextDouble();
		
		if (num > 0) {
			System.out.println("El número es positivo");
		} else {
			if (num < 0) {
				System.out.println("El número es negativo");
			} else {
				System.out.println("El número es cero");
			}
		}
		
		teclado.close();
	}

}
