import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String username; // = "null";

        System.out.print("Enter a username: ");
        username = stdin.nextLine();
        if (username == "") {
            username = "null";
        }

        System.out.print("Hello, ");
        System.out.println(username + ".");
        stdin.close();
    }
}
