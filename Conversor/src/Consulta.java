import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    public String valor ;
    public String base ;
    public String target ;



    public void  Valor (String valor) {

        this.valor = valor;
    }
    public void  Vbase (String base) {

        this.base = base;
    }
    public void  Vtarget (String target) {

        this.target = target;
    }

    public String Req () {
        String direccion = "https://v6.exchangerate-api.com/v6/bafdccdcc5396ce087f658b1/pair/"+base+"/"+target+"/"+valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return response.body();

    }



}
