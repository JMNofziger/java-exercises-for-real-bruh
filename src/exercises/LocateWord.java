package exercises;

import java.util.Scanner;

public class LocateWord {
    public static void main(String[] args){
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter the term you would like to search for: ");
        Scanner sc = new Scanner(System.in);
        String searchTerm = sc.nextLine().toLowerCase();

        for (String S : aliceSentence.split("\\s+")){
            S = S.replaceAll("[^A-Za-z0-9]", "");
            S = S.toLowerCase();
            if(S.equals(searchTerm)){
                System.out.println("WOAH IT'S A HIT!");
            }
            else{
                System.out.println("Nope, " + S + " does not a match " + searchTerm);
            }
        }

    }
}
