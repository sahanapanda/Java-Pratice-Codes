//Calculate Area of Rectangle
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Width : ");
        double w = input.nextDouble();

        System.out.print("Enter Height : ");
        double h = input.nextDouble();

        double area = 0;
        area = w*h;

        System.out.print("Area = " + area + "cm²");
        
        input.close();
        
    }
}
