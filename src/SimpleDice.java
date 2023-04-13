// random class: to generate random numbers
import java.util.Random;
public class SimpleDice {
    public static void main(String[] args) {
        // create object from random class
        Random random = new Random();
        int diceNumber = random.nextInt(12)+1;
        System.out.println(diceNumber);
    }
}
