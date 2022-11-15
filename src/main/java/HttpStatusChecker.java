import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {

    String getStatusImage(int code) throws IOException {

        String cat = "https://http.cat/" + code + ".jpg";
        URL url = new URL(cat);

        HttpURLConnection connection = ( HttpURLConnection ) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int statusCode = connection.getResponseCode();

        if (statusCode == 404) {
            return "\nThere is not image for HTTP status "+code;
        } else {
            return cat;
        }
    }
}
