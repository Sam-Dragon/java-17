package learn.java17.feature.http_client;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

/**
 * Refer
 * <a href="https://www.baeldung.com/java-9-http-client">...</a>
 */
public class HttpClientEnhanced {

    public static void main(String[] args) throws URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://postman-echo.com/get"))
            .version(HttpClient.Version.HTTP_2)
            .GET()
            .build();
    }
}
