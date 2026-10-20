import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double nota1, nota2, nota3, promedio;
		
		System.out.println("Dime la primera nota");
		nota1 = teclado.nextDouble();
		
		System.out.println("Dime la segunda nota");
		nota2 = teclado.nextDouble();
		
		System.out.println("Dime la tercera nota");
		nota3 = teclado.nextDouble();
		
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("La primera nota es incorrecta");
		} else {
			if (nota2 < 0 || nota2 > 10) {
				System.out.println("La segunda nota es incorrecta");
			} else {
				if (nota3 < 0 || nota3 > 10) {
					System.out.println("La tercera nota es incorrecta");
				} else {
					promedio = (nota1 + nota2 + nota3) / 3;
					System.out.println("El promedio de las tres notas es " + promedio);
				}
			}
			
		}
	}

}
