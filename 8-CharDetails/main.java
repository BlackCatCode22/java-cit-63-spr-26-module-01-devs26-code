import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);    

        System.out.print("Enter a single character: ");
        char charInput = stdin.next().charAt(0);

        System.out.println("Unicode: " + (int)charInput);

        // Hexadecimal Unicode Form;
        System.out.println("Hex Unicode: U+" + String.format("%04x",(int)charInput));
        
        System.out.print("It's a ");
        if (Character.isLetter(charInput)) {
            System.out.println("letter.");
        }
        else if (Character.isDigit(charInput)) {
            System.out.println("digit.");
        }
        else {
            System.out.println("unknown character."); // I forgot what these symbols are called.
        }
        stdin.close();
    }
}
