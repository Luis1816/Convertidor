import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {

    Cambio busquedaCambio(String moneda,String monedaCambio){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/96a0fbef49518e1d705d7c3c/pair/"+moneda+"/"+monedaCambio);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);
        } catch (Exception e) {
            throw new RuntimeException("no encontre esa moneda");
        }

    }

}
