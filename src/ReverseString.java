// 1. import the scanner
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("This program will reverse any sentence");
        //2. create scanner object
        Scanner reader = new Scanner(System.in);
        // 3. ask user to enter a name or sentence to reverse
        System.out.println("Enter a name to reverse : ");
        // 4. read user input as char array, type casting
        char[] letters = reader.nextLine().toCharArray();
        // 5. display the sentence using for loop
        for (int i=0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        // 6. print in reverse using for loop, hint: start from .length to index 0
        System.out.println("\nThe reversed sentence is : ");
        for (int i= letters.length-1 ; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }

    }
}
