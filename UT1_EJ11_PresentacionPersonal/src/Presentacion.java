import java.util.Scanner;

public class Presentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String nombre;
		int edad, altura;
		
		System.out.println("Dime tu nombre");
		nombre = teclado.next();
		
		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		
		System.out.println("Dime tu altura en cm");
		altura = teclado.nextInt();
		
		System.out.println("Tu nombre es " + nombre + ", tienes " + edad + " años y mides " + altura + "cm.");
	}

}
