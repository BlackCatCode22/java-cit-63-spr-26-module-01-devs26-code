import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Type a noun: ");
        String noun = stdin.next();
        System.out.print("Type a verb: ");
        String verb = stdin.next();
        System.out.print("Type an adjective: ");
        String adjective = stdin.next();

        stdin.close();

        System.out.println("The quick brown fox " + verb + " over the " + adjective + " " + noun + ".");
    }
}
