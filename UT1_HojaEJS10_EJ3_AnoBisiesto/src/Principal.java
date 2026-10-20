import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int year;
		
		System.out.println("Dime un año");
		year = teclado.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("El año es bisiesto.");
		} else {
			System.out.println("El año no es bisiesto.");
		}
		
		teclado.close();
	}

}
