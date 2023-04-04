import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFourthTask {
    /**
     * Javadoc.
     * A program that counts the number of words in a text file.
     * @author Popov Danil
     * @version 3.0
     */
    public static void main(String[] args) {
        // Check if the first argument in the command line is `args[0]`.
        // If not, then throw the exception `IllegalArgumentException`.
        if (args.length == 0) {
            throw new IllegalArgumentException("Path to file is not specified.");
        }

        String file = args[0]; //Reading the path to the file from the first command line argument.
        int count = 0;

        try (BufferedReader buffReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = buffReader.readLine()) != null) { // Every time in the loop we check if the line isn't empty.
                /*
                 We divide a string into words with one or more spaces
                 using a regular expression and turn them into an array
                 and then count the number of values in it.
                */
                String[] words = line.split("\\s+");
                count += words.length;
            }
            System.out.println("Word count: " + count);
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
}
