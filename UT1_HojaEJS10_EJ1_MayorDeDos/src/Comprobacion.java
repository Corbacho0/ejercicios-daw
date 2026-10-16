import java.util.Scanner;

public class Comprobacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num1, num2;
		
		System.out.println("Dime el primer número");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el segundo número");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El mayor de los dos números es " + num1);
		} else {
			System.out.println("El mayor de los dos números es " + num2);
		}
		
	}

}
