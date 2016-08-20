import java.util.Scanner;

/**
 * Created by tony on 20/08/2016.
 */
public class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Integer is even");
        }else{
            System.out.println("Integer is odd");
        }
    }
}
