// Array : collection of same datatype datas
public class Example1 {
    public static void main(String[] args) {
        String [] names = {"Harry", "Ron", "Draco", "Hermione"};

        System.out.println(names.length); // display the length of the array
        System.out.println(names[0]); // display Harry
        System.out.println(names[1]); // display Ron and so on
        System.out.println(names[2]);
        System.out.println(names[3]);

        System.out.println("Display array using for loop: ");
        // use for loop to display all the data inside your array
        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}
