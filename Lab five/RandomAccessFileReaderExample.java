import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReaderExample {
        public static void main(String[] args) {
            String filename = "example_random.bin";
            try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
                
                file.writeBytes("Hello! This is the start of random write.\n");

                
                file.seek(50);
                file.writeBytes("Random data at position 50.\n");

               
                file.seek(100);
                file.writeBytes("Random data at position 100.\n");

                System.out.println("Random writing done.");
            } catch (IOException e) {
                System.err.println("Error writing to the file: " + e.getMessage());
            }


            try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
                
                file.seek(0); 
                byte[] bytes = new byte[50];
                file.read(bytes);
                System.out.println("Reading from position 0: " + new String(bytes));

                
                file.seek(50); 
                file.read(bytes);
                System.out.println("Reading from position 50: " + new String(bytes));

                
                file.seek(100); 
                file.read(bytes);
                System.out.println("Reading from position 100: " + new String(bytes));
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }

