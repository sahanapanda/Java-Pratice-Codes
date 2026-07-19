import java.util.Scanner;

public class MenuDriven {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        
        System.out.println("Your choices are :\n1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        System.out.print("Enter choice by number: ");
        int choice = input.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Addition = "+ (a+b));
                break;
            case 2:
                System.out.print("Subtraction = "+ (a-b));
                break;
            case 3:
                System.out.print("Multiplication = "+ (a*b));
                break;
            case 4:
                System.out.print("Division = "+ (a/b));
                break;
        }
        input.close();
    }
}
