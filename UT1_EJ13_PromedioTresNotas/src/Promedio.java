import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double nota1, nota2, nota3, promedioNotas;
		
		System.out.println("Dime tu 1ª nota");
		nota1 = teclado.nextDouble();
	
		System.out.println("Dime tu 2ª nota");
		nota2 = teclado.nextDouble();
	
		System.out.println("Dime tu 3ª nota");
		nota3 = teclado.nextDouble();
	
		promedioNotas = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Tu promedio es " + promedioNotas);
		
	}

}
