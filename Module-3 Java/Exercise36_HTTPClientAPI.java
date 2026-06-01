import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exercise36_HTTPClientAPI {

    public static void main(String[] args) {

	try {

	    HttpClient client =
		    HttpClient.newHttpClient();

	    HttpRequest request =
		    HttpRequest.newBuilder()
			    .uri(URI.create(
				    "https://api.github.com"))
			    .build();

	    HttpResponse response =
		    client.send(
			    request,
			    HttpResponse.BodyHandlers.ofString());

	    System.out.println(
		    "Status Code: " +
			    response.statusCode());

	} catch(Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}

/*
Sample Output:

Status Code: 200
*/

