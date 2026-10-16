import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero1, numero2;
		boolean iguales;
		
		System.out.println("Dime el primer número");
		numero1 = sc.nextInt();
		
		System.out.println("Dime el segundo número");
		numero2 = sc.nextInt();
		
		iguales = numero1 == numero2;
		
		System.out.println("¿Los números son iguales?: " + iguales);
	}

}
