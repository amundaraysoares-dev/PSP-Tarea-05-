import java.util.Scanner;

public class Interfaz {

    public static void solicitud() {
        Scanner detectar = new Scanner(System.in);


        while (true) {
            System.out.print("Introduce un número (o 'salir' para terminar): ");
            String respuesta = detectar.nextLine();

            if (respuesta.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del programa");
                break;
            }


        }
    }
}