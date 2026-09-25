import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.File;
import java.lang.ProcessBuilder.Redirect;


public class Lanzador {
    public static void N1 (String num){
        ProcessBuilder factorizar = new ProcessBuilder("factor",num);
        factorizar.redirectErrorStream(true);
        Process proceso = null;

        try{
               proceso = factorizar.start();

            try (BufferedReader leer = new BufferedReader(new InputStreamReader(proceso.getInputStream()))){
                   String resultado;

                   while ((resultado = leer.readLine()) != null){
                       System.out.println(resultado);
                   }

            }
            int  C_Salida = proceso.waitFor();
            System.out.println("peración completada. Código de salida: "+C_Salida );


        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }




    }









}
