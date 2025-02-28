import javax.swing.*;
public class w2 {

    public static void main(String args[]) {
       String input =JOptionPane.showInputDialog("Enter your name: ");
       
        int answer = JOptionPane.showConfirmDialog(null, "Do you love coding in java?", "Week 2 Assignment #1", 
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
       
       if (answer == JOptionPane.YES_OPTION) {
           JOptionPane.showMessageDialog(null, "Thank you for loving java, " + input + "!", "Week 2 Assignment #1",
           JOptionPane.INFORMATION_MESSAGE);
       } else if (answer == JOptionPane.NO_OPTION) {
           JOptionPane.showMessageDialog(null, "That's sad to know.", "Week 2 ASsignment #1", 
                   JOptionPane.INFORMATION_MESSAGE);
       } else {
           JOptionPane.showMessageDialog(null, "You pressed cancel.", "Week 2 Assignment #1", 
                   JOptionPane.INFORMATION_MESSAGE);
       }
    }
}