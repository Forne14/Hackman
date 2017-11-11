import java.io.*;
import java.util.*;

public class Database {

    private Scanner x;

    private List<String> words = new ArrayList<String>(); // create the new list

    public void openFile() {
        try {
            x = new Scanner(new File("/Users/Denis/IdeaProjects/HackMan/src/words.txt"));
        } catch (Exception e) {
            System.out.println("could not get words database");

        }
    }

    public void readFile() { // read the file and create the word list.


        while (x.hasNext()) { // loop until reach the end of the file
            String w = x.next();

            words.add(w);

        }
//        System.out.println(words);
    }

    public void closeFile() {
        x.close();
    }

    public String getWord() { // choose a random word from the array

        String word = words.get(new Random().nextInt(words.size()));

        //System.out.print(word);      print the word
        return word;
    }


//    public static void main(String[] args) {
//        Database d = new Database();
//        d.openFile();
//        d.readFile();
//        d.closeFile();
//        String word = d.getWord();
//
//        System.out.print(word);
//    }

}


