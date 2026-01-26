import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = stdin.nextDouble();

        System.out.print("Enter second number: ");
        double secondNum = stdin.nextDouble();

        System.out.print("Enter an mathematical operator: ");
        char mathOp = stdin.next().charAt(0);

        double result;

        switch (mathOp) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case 'x':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            default:
                System.out.println("Invalid mathematical operator.");
                stdin.close();
                return;
        }
        System.out.printf("Answer: %.2f%n", result);
        stdin.close();
    }
}

// https://www.w3schools.com/java/java_switch.asp
// Mandatory w3schools link, because I have to.
