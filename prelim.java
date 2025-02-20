import javax.swing.*;
import java.text.DecimalFormat;
public class prelim {


    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("#.#");
        float average;
        int sum = 0;
        int fail = 0, passing = 0;
        int grade[] = new int[10];
        int i = 0;
        String first, last;
        String[] numbers;
        JOptionPane.showMessageDialog(null, """
                                            This program utilizes the functionality of String Class, 
                                             Selection and iteration Control Structure. 
                                             Please press  OK to continue""");
        do {
            first = JOptionPane.showInputDialog("Enter your first name: ");
            last = JOptionPane.showInputDialog("Enter your last name: ");
            if (!first.matches("[a-z A-Z ]+") || (!last.matches("[a-z A-Z]+"))) {
                JOptionPane.showMessageDialog(null, "Invalid input, please put letters only!");
            }
        } while (!first.matches("[a-z A-z]+")|| !last.matches("[a-z A-Z]+"));
        
        char fletter = first.charAt(0);
        char sletter = last.charAt(0);
        
        String fullName = first + " " + last;
        int text = fullName.indexOf('n');

        try { 
            do {
                
            
                String input = JOptionPane.showInputDialog("Enter grade: ");
                numbers = input.split("[ ,./\\-]+");
        
                if (numbers.length != 10) {
                    JOptionPane.showMessageDialog(null, "Error: Please enter exactly 10 grades!");
                }
            } while (numbers.length != 10);
            
            for (; i < 10; i++) {
                grade[i] = Integer.parseInt(numbers[i]);

            if (grade[i] < 70 || grade[i] > 100) {
                JOptionPane.showMessageDialog(null, "The input should only be greater than or equal \n to 70 and less than or equal to 100");
                JOptionPane.showMessageDialog(null, "Thank you for using my program. \n Nice working with you!");
            }

            if (grade[i] < 75) {
                fail++;
            } else {
                passing++;
            }
                sum += grade[i];
            }

            average = sum / 10.0f;
            String formattedAverage = df.format(average);
            JOptionPane.showMessageDialog(null, "Hi " + fullName + "!" 
                + "\nFull Name: " + fullName 
                + "\nInitials: " + fletter + "." + sletter + "."
                + "\nIndex of the first n: " + text 
                + "\n\nYour inputs are: " + String.join(" ", numbers)
                + "\n\n You have " + fail + " failing grades and " + passing + " passing grades."
                + "\n\n Your grade point average is " + formattedAverage + "%");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please only input numbers only on your grades. Thank you!");  
    } 
        JOptionPane.showMessageDialog(null, "Thank you for using my program. \n Nice working with you!");
}
}