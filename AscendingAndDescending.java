import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tony on 20/08/2016.
 */
public class AscendingAndDescending {

    public static void main(String[] args) {

        int number = 0;
        int [] arr = new int [3];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        number = scanner.nextInt();
        arr[0] = number;
        System.out.print("Enter an Integer: ");
        number = scanner.nextInt();
        arr[1] = number;
        System.out.print("Enter an Integer: ");
        number = scanner.nextInt();
        arr [2] = number;

        Arrays.sort(arr);
        System.out.print("Numbers in Ascending Order:" );
        for(int i = 0; i < arr.length; i++){
            System.out.print( " " + arr[i]);
        }
        System.out.print("\nNumbers in Descending Order: " );
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print( " " + arr[i]);
        }
    }
}
