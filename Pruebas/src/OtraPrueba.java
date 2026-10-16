import java.util.Scanner;

public class OtraPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe tu edad: ");
		
		int edad = teclado.nextInt();
		
		boolean mayorEdad = edad >= 18;
		
		System.out.println("Mayoría de edad: " + mayorEdad);
		
	}

}
