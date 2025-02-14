import java.io.*;
import java.util.regex.*;

public class SearchReplace {

    private String fileName = "gettys.html";

    public static void main(String[] args) {
        SearchReplace sr = new SearchReplace();
        sr.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String targetTag = "p";
            String replaceTag = "span";
            String attribute = "class";
            String value = "sentence";
            String line;
            int c = 1;

            // Create a Pattern object to match the entire line.
            Pattern pattern1 = Pattern.compile("(<" + targetTag + ".*?>)(.*?)(</" + targetTag + ".*?>)");

            while ((line = reader.readLine()) != null) {
                Matcher m = pattern1.matcher(line);

                if (m.find()) {
                    // Replace Start Tag
                    String newStart = replaceTag(m.group(1), targetTag, replaceTag);
                    newStart = replaceAttribute(newStart, attribute, value);
                    // Replace End Tag
                    String newEnd = replaceTag(m.group(3), targetTag, replaceTag);
                    // Reassemble the new line
                    String newLine = newStart + m.group(2) + newEnd;
                    System.out.printf("%3d %s\n", c, newLine);
                } else {
                    System.out.printf("%3d %s\n", c, line);
                }
                c++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public String replaceTag(String tag, String targetTag, String replaceTag) {
        Pattern p = Pattern.compile(targetTag);
        Matcher m = p.matcher(tag);
        if (m.find()) {
            return m.replaceFirst(replaceTag);
        }
        return tag;
    }

    public String replaceAttribute(String tag, String attribute, String value) {
        Pattern p = Pattern.compile(attribute + "=\".*?\"");
        Matcher m = p.matcher(tag);
        if (m.find()) {
            return m.replaceFirst(attribute + "=\"" + value + "\"");
        }
        return tag;
    }
}