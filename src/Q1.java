import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //1.	Write an application that reads in a number of lines from a file, giving each line a line number.
        //      Using a HashMap class, generate an index showing the lines on which each word in the file exists.
        //      If a word appears more than once in a single line then the line number should only be output once.
        Scanner scanner = new Scanner(new File("data.txt"));
        Map<String, Set<Integer>> fWord =  new HashMap<>();

        int lCount = 0;
        String line;
        String[] aLine = new String[0];
        while (scanner.hasNext())
        {
            line = scanner.next();
            aLine = line.split(" , ");
            for (int i = 0; i < aLine.length; i++)
            {
                if (!fWord.containsKey(aLine[i]))
                {
                    fWord.put(aLine[i],new HashSet<>());
                }
                (fWord.get(aLine[i])).add(lCount);

            }
            lCount++;
        }
        System.out.println(fWord.toString());

        System.out.println("End of Q1");

        // Extra exercise
        // Display the word that appears on most lines.
        String mostCommonWord = "";
        int mostCommonCount = 0;

        for (Map.Entry<String, Set<Integer>> entry : fWord.entrySet())
        {
            String word = entry.getKey();
            Set<Integer> lines = entry.getValue();

            if (lines.size() > mostCommonCount)
            {
                mostCommonCount = lines.size();
                mostCommonWord = word;
            }
        }
        System.out.println("The word that appears on the most lines is: " + mostCommonWord);


        // Words that appear on more than x lines.
        int x = 3;
        StringBuilder moreThanXLines = new StringBuilder();

        for (Map.Entry<String, Set<Integer>> entry : fWord.entrySet()) {
            String word = entry.getKey();
            Set<Integer> lines = entry.getValue();

            if (lines.size() > x) {
                moreThanXLines.append(word).append(" ");
            }
        }
        System.out.println("Words that appear on more than " + x + " lines: " + moreThanXLines);

        // All words in reverse alphabetical order that appears on x line

        String source = "abc";
        char charArray[] = source.toCharArray();

        Arrays.sort(charArray);

        for (String part : source.split(" ")) {
            System.out.print(new StringBuilder(part).reverse().toString());
            System.out.print(" ");
        }


        // Display the words that appear on both lines x and y, either line
    }
}
