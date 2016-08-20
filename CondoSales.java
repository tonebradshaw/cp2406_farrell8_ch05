import javax.swing.*;

/**
 * Created by tony on 20/08/2016.
 */
public class CondoSales {

    public static void main(String[] args) {

        String PARK_VIEW = "$150,000";
        String GOLF_COURSE_VIEW = "$175,000";
        String LAKE_VIEW = "$210,000";
        String input;

        input = JOptionPane.showInputDialog(null,
                "Choose view\n1 - park view\n2 - golf course view" +
                        "\n3 - lake view");
        int number = Integer.parseInt(input);

        switch (number) {

            case 1:
                System.out.println("Park View condos are " + PARK_VIEW);
                break;
            case 2:
                System.out.println("golf course view condos are " + GOLF_COURSE_VIEW);
                break;
            case 3:
                System.out.println("lake view condos are " + LAKE_VIEW);
                break;
            default:
                System.out.println("price is $0");
        }
    }

}

