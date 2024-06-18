public class Consulta {

    Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
    var busqueda = lectura.nextLine();

    String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey=d4d0bf92";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();
        System.out.println(json);
}
