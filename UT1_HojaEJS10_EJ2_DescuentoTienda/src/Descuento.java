import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double precio, importeFinal;
		final double Descuento = 0.10;
		
		System.out.println("¿Cuál ha sido el importe del producto?: ");
		precio = teclado.nextDouble();
		
		if (precio > 100) {
			importeFinal = precio - (precio * Descuento);
			System.out.println("¡Te corresponde un descuento! El importe final es de: " + importeFinal + "€");
			
		} else {
			System.out.println("El importe final es de " + precio + "€");
		}
	}

}
