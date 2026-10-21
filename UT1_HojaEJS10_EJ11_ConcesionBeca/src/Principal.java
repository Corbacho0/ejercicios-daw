import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int estrato;
		double promedio;
		
		System.out.println("¿Cuál es tu promedio de notas?");
		promedio = teclado.nextDouble();
		
		if (promedio >= 9) {
			System.out.println("¡Enhorabuena! Beca concedida.");
		} else {
			System.out.println("¿En qué estrato está tu nivel socioeconómico?");
			estrato = teclado.nextInt();
			if (promedio >= 8 && estrato == 1) {
				System.out.println("¡Enhorabuena! Beca concedida.");
			} else {
				System.out.println("No tienes derecho a beca.");
			}
		}
	}

}
