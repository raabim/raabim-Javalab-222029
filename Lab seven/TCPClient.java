import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 1234;
        try (Socket socket = new Socket(hostname, port);
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true);
             InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String text;
            while ((text = consoleReader.readLine()) != null) {
                writer.println(text);
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

