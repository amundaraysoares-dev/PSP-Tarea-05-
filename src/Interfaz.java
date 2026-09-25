import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    Lanzador lanzador = new Lanzador();


    System.out.println("Selecciona el nivel (1, 2, 3, 4): ");
    int nivel = teclado.nextInt();

    while (true) {
        if (nivel == 1 | nivel ==2 | nivel ==3 | nivel == 4) {
            System.out.println("Di un número o 'salir' para terminar: ");
            String numero = teclado.next();

            if (numero.equalsIgnoreCase("salir")) {
                System.out.println("¡Saliendo del programa!");
                break;
            }


            switch (nivel) {
                case 1:
                    lanzador.N1(numero);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona 1, 2, 3, 4 o salir.");
                    break;
            }
        }else{
            System.out.println("nivel no valido");
            break;
        }

    }
}