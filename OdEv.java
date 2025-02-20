import java.util.Scanner;

public class OdEv {

    public static void main(String[] args){
        Scanner pogi = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = pogi.nextInt();
    if(num != 0) {
        if (num % 2 == 0) {
            System.out.println("It's an even number!");
        }
        else {
            System.out.println("It's an odd number!");
        }
    } else {
        System.out.println("The number is invalid.");
    }
    }

}