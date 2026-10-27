import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int nota;
		
		System.out.println("Dime la nota de tu examen");
		nota = teclado.nextInt();
		
		switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Examen suspenso");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
				
			default:
				System.out.println("Nota no válida");
				break;
		}
	}

}
