import java.util.Scanner;

public class Invalid {
    public static void main(String[] args) {
        Scanner pogi = new Scanner(System.in);
        
        char option;

       do {
        System.out.print("Enter a number from 1-10: ");
        int num = pogi.nextInt();

        if (num >= 1 && num <= 10){
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else {
                System.out.println("Invalid number");
            }
        System.out.print("Again? y/n: ");
        option = pogi.next().charAt(0);
        
        while (option != 'y' && option != 'Y' && option != 'n' && option != 'N') {
            System.out.print("y or n only: ");
            option = pogi.next().charAt(0);
        }
       } while (option == 'y' || option == 'Y');

            if (option == 'n' || option == 'N'){
            System.out.println("Exiting...");
            }
        }
     }
