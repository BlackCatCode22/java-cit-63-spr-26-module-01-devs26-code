import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner radiusInput = new Scanner(System.in);
        double area;
        final double PI = Math.PI;
        /*
        double const pi = Math.PI;
        // I had to look up Java's equivalent to const.
        // Why is Java so different?
        */
       System.out.print("Enter the radius of circle: ");
        int radius = radiusInput.nextInt();
        radiusInput.close();
        area = PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + (int)Math.round(area));
    }
}
