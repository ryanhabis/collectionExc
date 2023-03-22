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
    }
}
