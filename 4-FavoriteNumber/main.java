import java.util.Scanner;

public class main {
    
    public static int getFavNum() {
        Scanner stdin = new Scanner(System.in);
        int userFavNum;

        userFavNum = stdin.nextInt();
        stdin.close();
        return userFavNum;
    }

    public static void prompt() {
        System.out.print("What is your favorite number?");
        System.out.println("");

        try {
            int printFavNum = getFavNum();
            System.out.print("Your favorite number is: ");
            System.out.println(printFavNum);
        } catch (Exception e) {
            System.out.println("Not a valid number.");
            System.out.println("""
            ---
            Let's try again.""");
            prompt();
        }
    }

    public static void main(String[] args) {
        prompt();
        
        /*
        https://www.w3schools.com/java/java_methods.asp
        https://www.w3schools.com/java/java_try_catch.asp
        
        The syntax is harder than C++. :/
        Also, if I went overboard, let me know.
        */
    }
}
