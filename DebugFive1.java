import javax.swing.*;

/**
 * Created by tony on 20/08/2016.
 */
public class DebugFive1 {

    public static void main(String args[]) throws Exception {

        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        String usersChoiceString;
        int usersChoice;
        double bill = 0.0;

        usersChoiceString = JOptionPane.showInputDialog(null,
                "Order please\n1 - Burger\n2 - Hotdog" +
                        "\n3 - Grilled cheese\n4 - Fish sandwich");
        usersChoice = Integer.parseInt(usersChoiceString);
        if(usersChoice == 1 || usersChoice == 2) {
            bill = bill + MED_PRICE;
        }else{
            bill = bill + HIGH_PRICE;}
        usersChoiceString = JOptionPane.showInputDialog(null,
                "Fries with that?\n1 - Yes\n2 - No");
        usersChoice = Integer.parseInt(usersChoiceString);
        if (usersChoice == 1);
        bill = bill + LOW_PRICE;
        JOptionPane.showMessageDialog(null,"Bill is $" + String.format("%.2f", bill));
    }
}
