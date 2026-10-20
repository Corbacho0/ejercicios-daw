import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double nota;
		
		System.out.println("Dime la nota de tu examen.");
		nota = teclado.nextDouble();
		
		if (nota >= 5 && nota <= 10) {
			System.out.println("El examen está aprobado");
		} else {
			if (nota >= 0 && nota < 5) {
				System.out.println("El examen está suspenso.");
			} else {
				System.out.println("Nota no válida.");
			}
		}
	} 

}
