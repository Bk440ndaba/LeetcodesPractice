import java.net.*;
import java.io.*;
import org.json.*;

public class NasaApod {
  public static void main(String[] args) throws Exception {
    // Replace with your API key
    String apiKey = "YOUR_API_KEY";

    // Construct the API request URL
    URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=" + apiKey);

    // Send the HTTP request
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();

    // Read the response
    int responseCode = conn.getResponseCode();
    if (responseCode == 200) {
      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String inputLine;
      StringBuilder response = new StringBuilder();
      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();

      // Parse the JSON response
      JSONObject json = new JSONObject(response.toString());
      String title = json.getString("title");
      String url = json.getString("url");
      String explanation = json.getString("explanation");

      // Print the results
      System.out.println("Title: " + title);
      System.out.println("URL: " + url);
      System.out.println("Explanation: " + explanation);
    } else {
      System.out.println("Error: " + responseCode);
    }
  }
}
