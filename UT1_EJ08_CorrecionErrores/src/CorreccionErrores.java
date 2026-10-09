
public class CorreccionErrores {

	public static void main(String[] args)	{
		int number = 10;
		// int number = 20; -> Dos variables con el mismo nombre
		int uninitialized;
		// System.out.println(uninitialized); -> No puede imprimir nada si la variable no tiene un valor
		// String text = 123; -> La cadena debe ir entre comillas dobles
		// System.out.println(undeclaredVariable); -> No se puede mostrar una variable que ni siquiera ha sido declarada.
		System.out.println(number);
	}
}