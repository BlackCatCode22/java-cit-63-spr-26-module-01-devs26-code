public class main {
    public static void main(String[] args) {
        int intNum = 123;
        double doubleNum = 1.23;
        boolean isTrue = true;
        var stringText = "One Two Three";
        char charText = 'c';

        int addOne = 1;
        int addTwo = 2;
        int addSum = addOne + addTwo;
        
        System.out.println("Int: " + intNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("String: " + stringText);
        System.out.println(charText);
        System.out.println("Basic Addition: " + addOne + "+" + addTwo + " = " + addSum);
        System.out.println("""
        ---
        1. Multi-line
        2. Multi-line
        3. Multi-line
        """);
        
        if (isTrue) {
            System.out.println("""
            Java has a way different syntax and I'll confuse myself.
            Hopefully, I don't get to touch the primitive types: byte, short, and long.
            I know how bits function, but still..."""
            );
        }
    }
}
