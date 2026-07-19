public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // Relational
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));

        // Logical
        System.out.println("Both numbers are positive: " + (a > 0 && b > 0));
        System.out.println("At least one number is positive: " + (a > 0 || b > 0));
        System.out.println("a and b are not equal: " + !(a == b));
    }
}
