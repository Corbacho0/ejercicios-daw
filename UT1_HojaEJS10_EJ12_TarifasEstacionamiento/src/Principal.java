import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int tiempoEstacionado;
		boolean finDeSemana;
		
		System.out.println("¿Cuántas horas has estado estacionado?");
		tiempoEstacionado = teclado.nextInt();
		
		System.out.println("¿Es fin de semana? True/False");
		finDeSemana = teclado.nextBoolean();
		
		if (tiempoEstacionado < 1 && tiempoEstacionado > 0) {
			System.out.println("El estacionamiento es gratuito.");
		} else {
			if (tiempoEstacionado > 1 && tiempoEstacionado < 3 && finDeSemana) {
				 System.out.println("Pagas la tarifa básica + recargo por alta demanda");
			} else {
				if (tiempoEstacionado > 1 && tiempoEstacionado < 3) {
					System.out.println("Pagas la tarifa básica");
				} else {
					if (tiempoEstacionado >= 3 && finDeSemana) {
						System.out.println("Pagas la tarifa extendida + recargo por alta demanda.");
					} else {
						if (tiempoEstacionado >= 3) {
							System.out.println("Pagas la tarifa extendida");
						} else {
							System.out.println("No has estado estacionado.");
						}
					}
			}
			
		}
		
		
	}

}
}