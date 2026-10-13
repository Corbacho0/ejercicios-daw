import java.util.Scanner;

public class Cambiar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int variableA, variableB, auxiliar;
		
		System.out.println("Dame un valor para la variable A");
		variableA = teclado.nextInt();
		
		System.out.println("Dame un valor para la variable B");
		variableB = teclado.nextInt();
		
		auxiliar = variableA;
		variableA = variableB;
		variableB = auxiliar;
		
		System.out.println("Ahora la variable A vale " + variableA + " y la variable B vale " + variableB);
		
	}

}
