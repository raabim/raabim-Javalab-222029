import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SequentialFileReaderExample{

        public static void main(String[] args) {
            String filename = "example_sequential.txt";

            try (FileWriter writer = new FileWriter(filename)) {
               
                writer.write("Line 1: Welcome to Sequential Write.\n");
                writer.write("Line 2: This is the second line.\n");
                writer.write("Line 3: We are writing in sequence.\n");
                System.out.println("Sequential writing done.");
            } catch (IOException e) {
                System.err.println("Error writing to the file: " + e.getMessage());
            }

           
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                // Reading file line by line sequentially
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }

        }
    }
