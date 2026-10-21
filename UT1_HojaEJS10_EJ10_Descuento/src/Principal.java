import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int importe;
		boolean socio;
		
		System.out.println("¿Cuál ha sido el importe de tu compra?");
		importe = teclado.nextInt();
		
		System.out.println("¿Eres socio del club? True/False");
		socio = teclado.nextBoolean();
		
		if (importe > 50 || socio == true) {
			System.out.println("¡Te corresponde un descuento!");
		} else {
			System.out.println("No te corresponde un descuento.");
		}
	}

}
