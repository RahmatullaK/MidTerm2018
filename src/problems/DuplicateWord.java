package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        String M = "Java is a programming Language";
        String[] words = M.split(" Java is also an Island of Indonesia");

        for (int i = 0; i < M.length(); i++) {
            for (int j = 0; j < M.length(); j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.printf("Duplicate Words :" + words[i], words[j]);

                }


            }


            /*
             * Write a java program to find the duplicate words and their number of occurrences in the string.
             * Also Find the average length of the words.
             */

            String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        }

    }

}