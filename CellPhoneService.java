import java.util.Scanner;

/**
 * Created by tony on 20/08/2016.
 */
public class CellPhoneService {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max value of talk minutes per month: ");
        int minutes = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.print("Enter max value of text messages per month: ");
        int messages = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.print("Enter max value of gigabytes of data per month: ");
        int data = scanner.nextInt();

        if(minutes < 500 && messages == 0 && data == 0){
            System.out.println("You should choose Plan A at $49/month");
        }else if(minutes < 500 && messages > 0 && data == 0){
            System.out.println("You should choose Plan B at $55/month");
        }else if(minutes >= 500 && messages <= 100 && data == 0){
            System.out.println("You should choose plan C at $61/month");
        }else if(minutes >= 500 && messages > 100 && data == 0){
            System.out.println("You should choose plan D at $70/month");
        }else if(data < 2){
            System.out.println("You should choose plan E at $75/month");
        }else if(data >= 2){
            System.out.println("You should choose plan F at $87/month");
        }
    }
}
