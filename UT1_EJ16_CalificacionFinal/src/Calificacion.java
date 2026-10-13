import java.util.Scanner;

public class Calificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double parcial1, parcial2, parcial3, totalParciales, examenFinal, totalExamen, trabajoFinal, totalTrabajo;
		
		System.out.println("Indica la calificación de tu 1er parcial: ");
		parcial1 = teclado.nextDouble();
		
		System.out.println("Indica la calificación de tu 2º parcial: ");
		parcial2 = teclado.nextDouble();
		
		System.out.println("Indica la calificación de tu 3er parcial: ");
		parcial3 = teclado.nextDouble();
		
		System.out.println("Indica la calificación de tu examen final: ");
		examenFinal = teclado.nextDouble();
		
		System.out.println("Indica la calificación de tu trabajo final: ");
		trabajoFinal = teclado.nextDouble();
		
		totalParciales = (parcial1 + parcial2 + parcial3) / 3 * 0.55;
		totalExamen = examenFinal * 0.30;
		totalTrabajo = trabajoFinal * 0.15;
		
		double notaFinal = totalParciales + totalExamen + totalTrabajo;
		
		System.out.println(notaFinal);
		
	}

}
