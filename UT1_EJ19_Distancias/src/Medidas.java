import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int medidaMm, medidaCm, medidaMetros, totalCm;
		
		System.out.println("Dame una medida en milímetros");
		medidaMm = teclado.nextInt();
		
		System.out.println("Dame una medida en centímetros");
		medidaCm = teclado.nextInt();
		
		System.out.println("Dame una medida en metros");
		medidaMetros = teclado.nextInt();
		
		totalCm = (medidaMm / 10) + (medidaMetros * 100) + medidaCm;
		
		System.out.println("El total de las medidas en centímetros es " + totalCm);
	}

}
