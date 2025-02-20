import javax.swing.*;

public class tfee {
    public static void main(String[] args) {
        String tuition = JOptionPane.showInputDialog("Enter tuition fee: ");
        float num = Float.parseFloat(tuition);
        
        JOptionPane.showMessageDialog(null, "Press 1 for Cash, 2 for Two-Installment, 3 for Three-Installment");
        
        String input = JOptionPane.showInputDialog("Enter Mode of Payment: ");
        int inp = Integer.parseInt(input);
        
        float newtuition;
        switch (inp) {
            case 1:
                {
                    newtuition = (int) (num * 0.90);
                    break;
                }
            case 2:
                {
                    newtuition = (int) (num * 1.05);
                    break;
                }
            case 3:
                {
                    newtuition = (int) (num * 1.10);
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "Invalid input! the options are only 1-3.");
                return;
        }
        JOptionPane.showMessageDialog(null, "Your total tuition fee is, " + newtuition);
    }
}
