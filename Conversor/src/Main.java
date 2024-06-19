import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba");

        Consulta consulta = new Consulta();
        consulta.Valor(lectura.nextLine());
        String json = consulta.Req();
        System.out.println(json);

    }
    }



