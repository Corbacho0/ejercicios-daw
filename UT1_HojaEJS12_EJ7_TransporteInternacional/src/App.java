import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int eleccion, peso;
        double precioFinal;

        System.out.println("¿Desde dónde envías el paquete?");
        System.out.println("1 - América del Norte \n2 - América Central \n3 - América del sur \n4 - Europa \n5 - Asia \nPor favor, elige tu número correspondiente a tu continente.");
        eleccion = teclado.nextInt();

        System.out.println("¿Cuál es el peso en kilogramos del paquete?");
        peso = teclado.nextInt();

        if (peso > 5) {
            System.out.println("Tu paquete no puede ser enviado porque excede el peso máximo.");
        } else {
            switch (eleccion) {
            case 1:
                precioFinal = peso * 24;
                System.out.println("El precio final del envío es de " + precioFinal + "€");
                break;
            case 2:
                precioFinal = peso * 20;
                System.out.println("El precio final del envío es de " + precioFinal + "€");
                break;
            case 3:
                precioFinal = peso * 21;
                System.out.println("El precio final del envío es de " + precioFinal + "€");
                break;
            case 4:
                precioFinal = peso * 10;
                System.out.println("El precio final del envío es de " + precioFinal + "€");
                break;
            case 5:
                precioFinal = peso * 18;
                System.out.println("El precio final del envío es de " + precioFinal + "€");
                break;
            default:
                System.out.println("Opción no válida.");
            }


        }

        
        teclado.close();

    }
}
