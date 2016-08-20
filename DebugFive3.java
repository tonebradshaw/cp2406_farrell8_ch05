import java.util.Scanner;

/**
 * Created by tony on 20/08/2016.
 */
public class DebugFive3 {

    public static void main (String args[]){
        int item;
        String output;
        final int HIGH = 11111;
        final int LOW = 999;
        final int CUTOFF = 500;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter item number: ");
        item = input.nextInt();
        if(item <= CUTOFF) {
            output = "Item number too low";
        }else if(item >= HIGH){
            output = "Item number too high";
        }else if(item <= LOW){
            output = "Valid - in Automotive Department";
        }else {
            output = "Valid - Item in Housewares Department";
        }
        System.out.println(output);

    }
}
