import java.util.Scanner;

public class ass2 {
    public static void main(String[] args){
        Scanner pogi = new Scanner(System.in);

        System.out.print("Please enter a letter: ");
        char letter = pogi.next().charAt(0);
    
    if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print("Its a vowel!");
                break;
            default:
            System.out.print("It's a consonant!");
        }
    } else {
        System.out.println("Please enter a valid letter!");
        }
    }
}
