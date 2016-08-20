import javax.swing.*;

/**
 * Created by tony on 20/08/2016.
 */
public class DebugFive4 {

    public static void main (String args[]){

        int one, two, three, four;
        String str, output;

        str = JOptionPane.showInputDialog(null, "Enter an integer: ");
        one = Integer.parseInt(str);
        System.out.println(one);
        str = JOptionPane.showInputDialog(null, "Enter an integer: ");
        two = Integer.parseInt(str);
        System.out.println(two);
        str = JOptionPane.showInputDialog(null, "Enter an integer: ");
        three = Integer.parseInt(str);
        System.out.println(three);
        str = JOptionPane.showInputDialog(null, "Enter an integer: ");
        four = Integer.parseInt(str);
        System.out.println(four);
        if(one > two && one > three && one < four) {
            output = "Highest is " + one;
        }else if(two > one && two > three && two > four) {
            output = "Highest is " + two;
        }else if(three > one && three > two && three > four) {
            output = "Highest is " + three;
        }else{
            output = "Highest is " + four;
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
