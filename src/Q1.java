import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q1 {

    public static void main(String[] args) throws FileNotFoundException
    {
        Map<String, Set<Integer>> fWords = popMap();
        //  1.	Write an application that reads in a number of lines
        //from a file, giving each line a line number.
        //Using a HashMap class, generate an index showing the lines on
        //which each word in the file exists.
        //If a word appears more than once in a single
        //line then the line number should only be output once.

//                System.out.println((int)'T');

    }
    private static Map<String,Set<Integer>>popMap() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("data.txt"));
        Map<String, Set<Integer>> fWords = new HashMap();
        int lCount = 1;
        String line;
        String[] aLine;
        while (sc.hasNext()) {
            line = sc.nextLine();
            aLine = line.split(" ");
            for (int i = 0; i < aLine.length; i++) {
                if (!fWords.containsKey(aLine[i])) {
                    fWords.put(aLine[i], new HashSet());
                }
                (fWords.get(aLine[i])).add(lCount);
            }
            lCount++;
        }
        return fWords;
    }
    //Any word that appears on most lines
    private static String mostUsed(Map<String, Set<Integer>> fWords) {
        int max = 0;
        String mWord = "";
        for (Map.Entry<String, Set<Integer>>element : fWords.entrySet()) {
            if(element.getValue().size()>max){
                max = element.getValue().size();
                mWord = element.getKey();
            }

        }
        return mWord;
    }
    //Words that appear on more than x lines
    private static Set<String> moreXLines(Map<String, Set<Integer>> fWords,int x) {


        Set<String> words = new HashSet<>();
        for (Map.Entry<String, Set<Integer>>element : fWords.entrySet()) {
            if(element.getValue().size()>x){
                words.add(element.getKey());

            }

        }
        return words;
    }
    //All words in reverse alpahabetical order that appear on line x
    private static Set<String> getLineXWords(Map<String, Set<Integer>> fWords,int x) {


        Set<String> words = new TreeSet<>(new RevStringComp());
        for (Map.Entry<String, Set<Integer>>element : fWords.entrySet()) {
            if(element.getValue().contains(x)){
                words.add(element.getKey());

            }

        }
        return words;
    }
    //Display words that appear on both line x and y, either line x or y, on line x but not y
    private static void commonWords(Map<String, Set<Integer>> fWords,int x, int y)
    {
        Set<String> lineX = getLineXWords(fWords, x);
        Set<String> lineY = getLineXWords(fWords, y);
        Set<String> common = new HashSet<>(lineX);
        common.retainAll(lineY);
        System.out.println("Words on both line " + x + " and line " + y + ": " + common);

    }

}