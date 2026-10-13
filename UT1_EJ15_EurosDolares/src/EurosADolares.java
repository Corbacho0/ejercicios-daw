import java.util.Scanner;

public class EurosADolares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double euros, dolares;
		
		System.out.println("Dame un valor en euros");
		euros = teclado.nextDouble();
		
		dolares = euros * 1.119;
		
		System.out.println(euros + " euros son " + dolares + " dólares.");
	}

}
