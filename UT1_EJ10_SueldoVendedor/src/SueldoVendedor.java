import java.util.Scanner;

public class SueldoVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double sueldoBase, sueldoTotal, comision1, comision2, comision3, netoComisiones;
		
		System.out.println("¿Cuál es el sueldo base?");
		sueldoBase = teclado.nextFloat();
		
		System.out.println("¿Cuál es la 1ª comisión?");
		comision1 = teclado.nextFloat();
		
		System.out.println("¿Cuál es la 2ª comisión?");
		comision2 = teclado.nextFloat();
		
		System.out.println("¿Cuál es la 3ª comisión?");
		comision3 = teclado.nextFloat();
		
		netoComisiones = (comision1 * 0.1) + (comision2 * 0.1) + (comision3 * 0.1);
		
		sueldoTotal = sueldoBase + netoComisiones;
		
		System.out.println("La cantidad que recibe por las comisiones es: " + netoComisiones);
		System.out.println("El sueldo total que cobra es: " + sueldoTotal); 
	}

}
