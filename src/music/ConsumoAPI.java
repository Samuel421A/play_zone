package music;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {
    public void request() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://itunes.apple.com/search?term=Queen&entity=song&limit=10"
                ))
                .build();

        HttpResponse<String> response = client.send(
                request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
