public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic
        int a = 10;
        int b = 3;
        System.out.println("Arithmetic: " + (a + b)); // 13

        // Relational
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual); // false

        // Logical
        boolean condition = (a > 5 && b < 5);
        System.out.println("Logical AND Result: " + condition); // true

        // Ternary Operator
        String type = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number 10 is: " + type);
    }
}
