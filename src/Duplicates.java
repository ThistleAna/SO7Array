// import random class
import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        //initialise empty array1 with size 10
        int [] array1 = new int[10];
        //generate random numbers to fill in your array1
        for (int i=0; i<array1.length; i++){
            array1[i] = random.nextInt(20)+1;
            System.out.print(array1[i] + " ");
        }
        // print array1 using for loop
        int [] array2 = new int[10];
        //initialise empty array2 with size 10
        System.out.println(); // create a new line
        for (int i=0; i<array2.length; i++){
            array2[i] = random.nextInt(20)+1;
            System.out.print(array2[i] + " ");
        }
        System.out.println("Duplicates are : ");
       // use nested for loops to loop through array1 and array2
        // inside this loops, if array1[i] == array2[j], then print
        for (int i=0; i < array1.length; i++) { // access elements at array1
            for (int j=0; j < array2.length; j++){ // access elements at array2
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
