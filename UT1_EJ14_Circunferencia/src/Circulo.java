import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double longitudRadio, longitudCircunferencia, area, volumen;
		
		System.out.println("¿Cuál es el radio?");
		longitudRadio = teclado.nextDouble();
		
		longitudCircunferencia = 2 * Math.PI * longitudRadio;
		
		area = Math.PI * Math.pow(longitudRadio, 2);
		
		volumen = (4/3) * Math.PI * Math.pow(longitudRadio, 3);
		
		System.out.println("La longitud es: " + longitudCircunferencia + "; El area es: " + area + "; Y el volumen: " + volumen);
	}

}


