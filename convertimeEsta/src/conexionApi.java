import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class conexionApi extends menu {

    public String conexionApi(String opcion) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/1cbb741c45afe10fa54bdc2a/latest/" + opcion;

        // conexion de red pichurrys
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
        HttpResponse <String>respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
        return respuesta.body();

    }

}