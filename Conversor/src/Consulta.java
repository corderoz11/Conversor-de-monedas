

public class Consulta {



    public Consulta(var busqueda){
    String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey=d4d0bf92";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();
    System.out.println(json);
    return (json);
}

}
