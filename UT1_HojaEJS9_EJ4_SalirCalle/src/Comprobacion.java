import java.util.Scanner;

public class Comprobacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Está lloviendo? true/false: ");
		boolean comprobarLluvia = sc.nextBoolean();
		
		System.out.println("¿Has terminado tus tareas? true/false: ");
		boolean comprobarTareas = sc.nextBoolean();
		
		boolean permisoCalle = comprobarTareas && comprobarLluvia;
		
		System.out.println("¿Permiso para salir?: " + permisoCalle);
		
	}

}
