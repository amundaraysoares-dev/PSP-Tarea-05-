import java.util.Scanner;

public class Interfaz {

    public static void solicitud() {
        int resultado = 0;
        Scanner detectar = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un número (o 'salir' para terminar): ");
            String respuesta = detectar.nextLine();

            if (respuesta.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }

            try {
                numero = Integer.parseInt(respuesta);
                resultado = numero;
                System.out.println("esto esta bien. Número guardado: " + resultado);
            } catch (NumberFormatException exception) {
                System.out.println("eso no se puede poner");
            }
        }
    }
}