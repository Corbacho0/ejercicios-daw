import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double tf, tc;
		
		System.out.println("Dime una temperatura en Fahrenheit");
		tf = teclado.nextDouble();
		
		tc = (tf - 32) * 5 / 9;
		
		if (tc >= -90 && tc <= 60) {
			System.out.println("El resultado en grados celsius es " + tc);
		} else {
			System.out.println("Temperatura no válida");
		}
	}

}
