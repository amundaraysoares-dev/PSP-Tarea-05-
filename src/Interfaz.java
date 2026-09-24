import java.util.Scanner;

public class Interfaz {

public void solicitud(){
  Scanner detectar = new Scanner(System.in);


    while (true){
        System.out.println("Introduce un número (o 'salir' para terminar):");
        String salida = detectar.nextLine();


        int num = detectar.nextInt();
        if (salida.equals("salir")){
            System.out.println("Saliendo del programa");
            break;
        } else{
            System.out.println("Solo se admite el mensaje Salir");

        }




    }

};








}
