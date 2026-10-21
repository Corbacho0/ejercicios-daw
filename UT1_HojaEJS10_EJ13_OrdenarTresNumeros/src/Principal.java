import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Dime el primer número");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el segundo número");
		num2 = teclado.nextInt();
		
		System.out.println("Dime el tercer número");
		num3 = teclado.nextInt();

		if(num1 > num2 && num1 > num3) {
			System.out.println("Ordenados:" + num1 + ", " + Math.max(num2, num3) + ", " + Math.min(num2, num3));
		} else {
			if(num2 > num1 && num2 > num3) {
				System.out.println("Ordenados: " + num2 + ", " + Math.max(num1, num3) + ", " + Math.min(num1, num3));
			} else {
				if (num3 > num1 && num3 > num2) {
					System.out.println("Ordenados: " + num3 + ", " + Math.max(num1, num2) + ", " + Math.min(num1, num2));
				} else {
					System.out.println("Son iguales");
				}
			}
				
		}
		
		/* 
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + num2 + num3);
		} else {
			if (num2 > num1 && num1 > num3) {
				System.out.println(num2 + num1 + num3);
			} else {
				System.out.println(num3 + );
			}
		}
		*/
	}

}
