import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        double principal;
        double rate;
        double time;
        double simpleInterest;

        System.out.print("Initalize the base investment: ");
        principal = stdin.nextDouble();

        System.out.print("Enter rate (i.e., %): ");
        rate = stdin.nextDouble();

        System.out.print("Enter amount of years: ");
        time = stdin.nextDouble();

        simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The simple interest is: %.2f%n", simpleInterest);

        stdin.close();
    }
}
