package class2exercises;

import java.util.ArrayList;

public class ExactlyFiveLetters {
    public static void main(String[] args){
        // ArrayList and Strings: Write a static method to print out each word in a list that has exactly 5 letters.
        ArrayList<String> words = new ArrayList<>();
        // Add words to ArrayList words in a very annoying way...
        words.add("Salmon");
        words.add("Okay");
        words.add("Turkey");
        words.add("Tuna");
        words.add("Sammy");
        words.add("Eagle");
        words.add("Osprey");
        words.add("Roman");
        words.add("Tango");
        words.add("Simon");
        words.add("Rango");

        for(String word : words){
            if(word.length()==5){
                System.out.println("Aw yeah, this word --> '" + word + "' is exactly 5 char long.");
            }
            else{
                System.out.println("NO FUCKING WAY I'M PRINTING THAT SHIT, IT'S NOT 5 CHAR LONG");
            }
        }
    }
}
