package class2exercises;

public class PrintArrayIndex {
    public static void main(String[] args){
        //Arrays: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.

        // The following commented out line does the same initialization/declaration seen below; much shorter;
        int[] numbers = new int[]{1,1,2,3,5,8};

        //And here's the really dumb way of doing this!
        //int maxValues = 6;
        //int[] numbers = new int[maxValues];
        //numbers[0] = 1;
        //numbers[1] = 1;
        //numbers[2] = 2;
        //numbers[3] = 3;
        //numbers[4] = 5;
        //numbers[5] = 8;

        for(int x = 0; x < numbers.length; x++){
            System.out.println("Index " + x + " has a value of " + numbers[x]);
        }
        System.out.println("Nice work, Jacob! You're a GENIUS!!");
    }
}
