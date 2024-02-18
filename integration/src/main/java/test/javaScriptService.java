package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class javaScriptService {

    public void processMessage(String message) {
        System.out.println("Processing message: " + message);
        //callWebService(message);
        //saveToDatabase(message);
    }

    public void callWebService(String message) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String responseBody = "API Response Code: " + responseCode + "\n" +
                    "API Response: " + response;

            System.out.println(responseBody);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveToDatabase(String message) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "root", "password");

            String sql = "INSERT INTO messages (message) VALUES (?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, message);
            int rowsAffected = pstmt.executeUpdate();

            System.out.println("Rows affected in database: " + rowsAffected);

            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

