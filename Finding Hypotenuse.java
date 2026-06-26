import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double a; double b; double c;
        
        System.out.print("Enter side of length A : ");
        a = input.nextDouble();
        
        System.out.print("Enter side of length B : ");
        b = input.nextDouble();
        
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.print("Hypotenuse: " + c);
        
        input.close();
        
    }
}
