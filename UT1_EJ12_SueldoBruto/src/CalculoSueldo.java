import java.util.Scanner;

public class CalculoSueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String nombreEmpleado;
		int horas, precioHora, sueldoBruto;
		
		System.out.println("¿Cuál es tu nombre?");
		nombreEmpleado = teclado.next();
		
		System.out.println("¿Cuántas horas has trabajado?");
		horas = teclado.nextInt();
		
		System.out.println("¿Cuál es tu sueldo / hora?");
		precioHora = teclado.nextInt();
		
		sueldoBruto = horas * precioHora;
		
		System.out.println("Tu sueldo bruto son: " + sueldoBruto + "€.");
		
	}

}
