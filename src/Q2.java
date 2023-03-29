import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> uniqueWords = new HashSet<>();
        Scanner sc = new Scanner(new File("data.txt"));

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            for (String word : words) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Unique words: " + uniqueWords);
    }
}
