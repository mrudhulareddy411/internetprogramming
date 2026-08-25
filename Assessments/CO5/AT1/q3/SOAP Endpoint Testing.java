import java.net.HttpURLConnection;
import java.net.URL;

public class EndpointChecker {

    public static void main(String[] args) {

        String endpoint =
            "http://localhost:8080/EnterpriseService";

        try {

            URL url = new URL(endpoint);

            HttpURLConnection connection =
                (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            connection.setConnectTimeout(5000);

            connection.connect();

            int status =
                connection.getResponseCode();

            System.out.println(
                "HTTP Status Code: " + status
            );

            if (status >= 200 && status < 400) {

                System.out.println(
                    "Endpoint is reachable"
                );

            } else {

                System.out.println(
                    "Endpoint problem detected"
                );
            }

            connection.disconnect();

        } catch (Exception e) {

            System.out.println(
                "Endpoint Error: "
                + e.getMessage()
            );
        }
    }
}
