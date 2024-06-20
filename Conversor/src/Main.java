import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {


        System.out.println("Conversor de Divisas");
        System.out.println("");
        System.out.println("Dijite 1 para continuar");

        Scanner lectura = new Scanner(System.in);


        while(Integer.parseInt(lectura.nextLine())==1){

            System.out.println("Dijite unicamente el numero de la opcion con la conversion deseada");
            System.out.println("");
            System.out.println("1) Dolar >> Peso Argentino");
            System.out.println("2) Peso Argentino >> Dolar");
            System.out.println("3) Dolar >> Real Brasileño");
            System.out.println("4) real Brazileño >> Dolar");
            System.out.println("5) Dolar >> Peso Colombiano");
            System.out.println("6) Peso Colombiano >> Dolar");





            Logica logica = new Logica();
            logica.Logica(Integer.parseInt(lectura.nextLine()));
            String resultado = logica.Base();
            String resultado2 = logica.Target();
            System.out.println(resultado);
            System.out.println(resultado2);

            System.out.println("Ingrese el valor que desea convertir: ");



            Consulta consulta = new Consulta();
            consulta.Valor(lectura.nextLine());
            consulta.Vbase(logica.Base());
            consulta.Vtarget(logica.Target());

            String json = consulta.Req();
            System.out.println(json);

            Gson gson = new GsonBuilder()

                    .create();

            ReqFilter reqfilter = gson.fromJson(json, ReqFilter.class);
            System.out.println(reqfilter);
            Resultado ok = new Resultado(reqfilter);
            String ok2 = ok.getRate();

            System.out.println(ok2);

            System.out.println("El resultado de la convercion de"+consulta.getValor()+" "+logica.Base()+"a"+logica.Target()+"es de"+ok.getResultadoconversion());
            System.out.println("");

            System.out.println("Dijite 1 para realizar una nueva conversion o dijite 7 para salir");





        }




    }
    }



