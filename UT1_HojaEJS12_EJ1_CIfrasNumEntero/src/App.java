import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int num;

        System.out.println("Introduce un número comprendido entre 0 y 99999");
        num = teclado.nextInt();

        if (num <= 9 && num >= 0) {
            System.out.println("El número tiene una cifra");
        } else {
            if (num >= 10 && num <= 99) {
                System.out.println("El número tiene dos cifras");
            } else {
                if (num >= 100 && num <= 999) {
                    System.out.println("El número tiene tres cifras");
                } else {
                    if (num >= 1000 && num <= 9999) {
                        System.out.println("El número tiene cuatro cifras");
                    } else {
                        if (num >= 10000 && num <= 99999) {
                            System.out.println("El número tiene cinco cifras");
                        } else {
                            System.out.println("El número no está comprendido entre 0 y 99999");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
