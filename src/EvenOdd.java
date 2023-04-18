import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int [] array = new int [10];
        System.out.println("Enter 10 numbers");
        for (int i =0; i<array.length; i++) {
            array[i] = reader.nextInt();
        }

        System.out.println("Odd values are : ");
        for (int i=0; i <array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
