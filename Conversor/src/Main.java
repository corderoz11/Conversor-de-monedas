import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba");

        Logica logica = new Logica();
        logica.Logica(Integer.parseInt(lectura.nextLine()));
        String resultado = logica.Base();
        String resultado2 = logica.Target();
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println("Ingrese el valor que desea convertir: ");
        Scanner lectura2 = new Scanner(System.in);


        Consulta consulta = new Consulta();
        consulta.Valor(lectura2.nextLine());
        consulta.Vbase(logica.Base());
        consulta.Vtarget(logica.Target());

        String json = consulta.Req();
        System.out.println(json);

    }
    }



