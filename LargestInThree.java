import java.util.Scanner;
public class LargestInThree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first integer : ");
        int a = input.nextInt();
        System.out.println("Enter second integer : ");
        int b = input.nextInt();
        System.out.println("Enter third integer : ");
        int c = input.nextInt();
        
        if (a>b && a>c){
            System.out.printf("%d is the largest integer", a);
        }
        
        else if (b>b && b>c){
            System.out.printf("%d is the largest integer", b);
        }
        
        else{
            System.out.printf("%d is the largest integer", c);
        }
        
        input.close();
    }
}
