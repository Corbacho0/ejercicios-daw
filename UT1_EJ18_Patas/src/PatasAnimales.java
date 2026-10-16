import java.util.Scanner;

public class PatasAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int hormigasCapturadas, aranasCapturadas, cochinillasCapturadas, patasHormigas, patasAranas, patasCochinillas;
		
		System.out.println("¿Cuántas hormigas hay capturadas?");
		hormigasCapturadas = teclado.nextInt();
		
		System.out.println("¿Cuántas arañas hay capturadas?");
		aranasCapturadas = teclado.nextInt();
		
		System.out.println("¿Y cochinillas?");
		cochinillasCapturadas = teclado.nextInt();
		
		patasHormigas = hormigasCapturadas * 6;
		patasAranas = aranasCapturadas * 8;
		patasCochinillas = cochinillasCapturadas * 14;
		
		int totalPatas = patasHormigas + patasAranas + patasCochinillas;
		
		System.out.println("El número total de patas entre todos los animales es " + totalPatas);
		
	}

}
