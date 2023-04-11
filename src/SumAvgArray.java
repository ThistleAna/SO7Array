public class SumAvgArray {
    public static void main(String[] args) {
        int sum =0;
        // create an array of integers
        int [] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        // display using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            // add sum with the next number
            sum = sum + numbers[i]; // shortcut sum += numbers[i]
        }
        System.out.println("Total = " + sum);

        // calculate the average, type casting int num to double num
        double average = (double)sum / numbers.length;
        System.out.println("Average = " + average);
    }
}
