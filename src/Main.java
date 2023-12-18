import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String fileName = "text.txt";
        ArrayList<String> input = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                input.add(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new CustomException("This is custom exception: " + e.getMessage());
        }
    }

    public static class CustomException extends RuntimeException {
        public CustomException() {
            super();
        }

        public CustomException(String message) {
            super(message);
        }
    }
}