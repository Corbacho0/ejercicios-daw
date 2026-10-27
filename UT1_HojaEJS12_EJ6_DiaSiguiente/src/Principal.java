import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int dia, mes, year;
		
		System.out.println("Dime el día:");
		dia = teclado.nextInt();
		
		System.out.println("Dime el mes");
		mes = teclado.nextInt();
		
		System.out.println("Dime el año");
		year = teclado.nextInt();
		
		switch (dia) {
			case 31:
				if (mes == 12 ) {
					mes = 1;
					year++;
					System.out.println("El día siguiente es: 1 del " + mes + " del " + year);
				} else {
					mes++;
					System.out.println("El día siguiente es el 1 del " + mes + " del " + year );
				}
				break;
			default:
				dia++;
				System.out.println("El día siguiente es el " + dia + " del " + mes + " del " + year);
					
					
		}
			
			
		
	}

}
