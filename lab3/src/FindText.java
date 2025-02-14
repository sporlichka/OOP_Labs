import java.io.*;
import java.util.regex.*;

public class FindText {

    private String fileName = "gettys.html";
    private Pattern pattern;
    private Matcher m;

    public static void main(String[] args) {
        System.out.println("Current working directory: " + new File(".").getAbsolutePath());
        FindText find = new FindText();
        find.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int c = 1;
            pattern = Pattern.compile("<h4>.*</h4>"); // Modified to match whole h4 tag content

            while ((line = reader.readLine()) != null) {
                m = pattern.matcher(line);

                if (m.find()) {
                    System.out.println(c + " " + line); // Corrected concatenation
                }
                c++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
