import javax.swing.*;

/**
 * Created by tony on 20/08/2016.
 */
public class CondoSales2 {

    public static void main(String[] args) {

        String PARK_VIEW = "$150,000";
        String GOLF_COURSE_VIEW = "$175,000";
        String LAKE_VIEW = "$210,000";
        String input;
        int number, park;


        input = JOptionPane.showInputDialog(null, "Choose view\n1 - park view\n2 - " +
                "golf course view\n3 - lake view");
        number = Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null, "Choose parking\n1 - garage" +
                "\n2 - parking space");
        park = Integer.parseInt(input);

        if(park == 1) {
            switch (number) {

                case 1:
                    System.out.println("Park View condos are " + PARK_VIEW + " plus $5000 for a garage");
                    break;
                case 2:
                    System.out.println("golf course view condos are " + GOLF_COURSE_VIEW + " plus $5000 for a garage");
                    break;
                case 3:
                    System.out.println("lake view condos are " + LAKE_VIEW + " plus $5000 for a garage");
                    break;
                default:
                    System.out.println("price is $0");
            }
        }else{
            switch (number) {

                case 1:
                    System.out.println("Park View condos are " + PARK_VIEW + " with parking space");
                    break;
                case 2:
                    System.out.println("golf course view condos are " + GOLF_COURSE_VIEW + " with parking space");
                    break;
                case 3:
                    System.out.println("lake view condos are " + LAKE_VIEW + " with parking space");
                    break;
                default:
                    System.out.println("price is $0");
            }
        }
    }
}

