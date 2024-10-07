import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class filehandling {
    public static void main(String[] args) {
        String fileName = "C:/Users/t00226269/Desktop/hamlet.txt";
        TreeSet hamlet = new TreeSet();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    hamlet.add(word);
                    System.out.println(word + " " + lineNumber);
                }
                lineNumber++;
            }
            System.out.println(hamlet);
            System.out.println(hamlet.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}