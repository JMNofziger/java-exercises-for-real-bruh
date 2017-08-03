package exercises;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String uname = scanner.nextLine();
        System.out.println("Hello " + uname + "!");
    }
}
