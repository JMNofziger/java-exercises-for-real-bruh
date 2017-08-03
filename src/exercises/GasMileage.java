package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
        System.out.println("Enter the number of miles that you've driven: ");
        Scanner scanner = new Scanner(System.in);
        float totalmiles = scanner.nextInt();
        System.out.println("Enter the number of gallons of gas consumed in gallons: ");
        float totalgals = scanner.nextInt();
        float gasmileage = totalmiles / totalgals;
        System.out.println("You achieved an efficiency of " +  gasmileage + " miles per gallon");

    }
}
