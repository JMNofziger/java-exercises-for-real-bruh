package class2exercises;

import java.util.ArrayList;
import java.util.Random;

public class SumAllEven {
    public static void main(String[] args){
        // Goal: Write a static method to find the sum of all the even numbers in a list.
        ArrayList<Integer> numbers = new ArrayList<>();
        // populate  an arraylist with ten random int values between 0 and 100
        for(int x = 0; x<10; x++){
            Random randy = new Random();
            int value = randy.nextInt(100);
            numbers.add(value);
        }
        int sum= 0;
        // iterate through numbers arraylist and accumulate the value to our sum variable if it is an even number
        for( int number : numbers){
            if(number % 2 == 0){
               sum += number;
               System.out.println("Okay, " + number + " is EVEN and after accumulation our sum is now: " + sum);
            }
            else {
                System.out.println("Nope, " + number + " is an ODD number!");
            }
        }
        // Print the total of the sum of the even numbers in our numbers list
        System.out.println("OKAY, WOAH, WE'RE DONE THE TOTAL OF ALL OUR EVEN VALUES IN THE numbers ARRAYLIST IS: " + sum);
    }
}
