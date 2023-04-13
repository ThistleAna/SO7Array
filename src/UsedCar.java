public class UsedCar {
    public static void main(String[] args) {
        int [] prices = {12000, 34000, 56000, 15450, 45000};
        for (int i =0; i < prices.length; i++){
            System.out.println(prices[i]);
        }
        // update the first value
        System.out.println("Updated prices: ");
        prices[0] = 12670;
        for (int i =0; i < prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}
