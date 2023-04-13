public class TwoDimesionArray {
    public static void main(String[] args) {
        int [][] numbers = {{1, 2, 3},{4, 5, 6}};
        // accessing array element
        System.out.println(numbers[0][0]); // output 1
        System.out.println(numbers[0][1]); // output 2
        System.out.println(numbers[0][2]); // output 3
        System.out.println(numbers[1][0]); // output 4
        System.out.println(numbers[1][1]); // output 5
        System.out.println(numbers[1][2]); // output 6

        // access all elements using nested for loops
        System.out.println("Access all using nested for loops");
        for (int i=0; i<numbers.length; i++) {// accessing rows
            for (int j=0; j<numbers[i].length; j++ ){ // accessing col
                System.out.println(numbers[i][j]);
            }
        }
    }
}
