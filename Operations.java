import java.util.Scanner;

public class Operations{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        
        //Arithematic Operations
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Modulus = " + (a%b));
        
        //Relational Operations
        System.out.println("a is greater than b = " + (a>b));
        System.out.println("a is less than b = " + (a<b));
        System.out.println("a is equal to b = " + (a==b));
        System.out.println("a is greater than or equal to b = " + (a>=b));
        System.out.println("a is less than or equal to  b = " + (a<=b));
        System.out.println("a is not equal to b = " + (a!=b));
        
        //Logical Operations
        System.out.println("Both numbers are positive = " + (a>0&& b>0));
        System.out.println("One number is positive = " + (a>0 || b>0));
        System.out.println("Both numbers are not equal = " + !(a==b));
        
        input.close();
    }
}
