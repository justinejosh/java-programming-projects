import java.util.Scanner;

public class threelooping {
    public static void main(String[] args) {
        Scanner pogi = new Scanner (System.in);
        
        int num;

        System.out.print("Enter your name: ");
        String name = pogi.nextLine();
        
        for(num = 0; num < 5; num++) {
            System.out.println(name);
        }
        }
    }
