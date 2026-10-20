import java.util.Scanner;

public class Principal {

	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombre;
		int edad, altura;
		
		System.out.println("Dime tu nombre");
		nombre = teclado.next();
		
		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		
		System.out.println("Por último, dime tu altura en centímetros");
		altura = teclado.nextInt();
		
		if (edad < 0 && edad > 120 || altura < 30) {
			System.out.println("Datos incorrectos.");
		} else {
			System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y mides " + altura + " centímetros");
		}
	}
}
