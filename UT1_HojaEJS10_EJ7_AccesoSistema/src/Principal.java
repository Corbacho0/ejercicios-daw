import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String user, pass;
		
		System.out.println("Dame el usuario");
		user = teclado.next();
		
		System.out.println("Ahora, la contraseña");
		pass = teclado.next();
		
		if (user.equals("admin") && pass.equals("@gora_24")) {
			System.out.println("Acceso concedido");
		} else {
			if (!user.equals("admin")) {
				System.out.println("Usuario incorrecto");
			} else {
				System.out.println("Contraseña incorrecta");
			}
		}
		
		teclado.close();
	}

}
