import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIndexOutBounds extends Throwable {

    public static void main(String[] args){

        Scanner index = new Scanner(System.in);
        System.out.println("Choose an index of array to see the value: ");

        int[] array = {100, 298, 397, 486, 534, 695};

        try {
            int number = index.nextInt();
            System.out.println("Result is: " + array[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the index is out of bounds");
        }
    }
}