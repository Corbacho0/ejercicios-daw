import java.util.Scanner;

public class ConversionTemperatuas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int fahrenheit, celsius;
		
		System.out.println("¿Qué grados Fahrenheit quieres convertir a Celsius?");
		fahrenheit = teclado.nextInt();
		
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println(fahrenheit + " Fahrenheit son: " + celsius + " celsius.");
		
	}

}
