import java.util.Scanner;

public class IVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double precio, precioFinal;
		final double IVA = 0.21;
		
		System.out.println("¿Cuál es el precio del producto?");
		precio = teclado.nextDouble();
		
		precioFinal = (precio * IVA) + precio;
		
		System.out.println("El precio final de tu producto es: " + precioFinal);
	}	

}
