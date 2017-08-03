package class1exercises;
import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args){
       System.out.println("What is the length of the rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("What is the width of the rectangle: ");
        int width =  scanner.nextInt();
        int area = length * width;
        System.out.println("Your rectangle has an area of " + area + " units squared");

    }
}
