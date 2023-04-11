import java.util.Scanner;

public class ExistinArray {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // create an array of integers
        int [] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        // ask user to guess our number
        System.out.println("Guess my number, my number is between 12 to 25 : ");
        int guess = reader.nextInt(); // take user input as int

        boolean isFound = false;
        for (int i=0; i < numbers.length; i++){
            if (guess == numbers[i]){
                isFound = true;
            }
        }

        //If the value exists, output “Value X found in array” otherwise, output “Value was not found in array”.
        if (isFound) {
            System.out.println("Value " + guess + " found in array.");
        } else {
            System.out.println("Value " + guess + " not found in array.");
        }
    }
}
