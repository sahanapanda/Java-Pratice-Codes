import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Width = ");
        Double w = input.nextDouble();

        System.out.print("Enter Length = ");
        Double l = input.nextDouble();

        Double area = w*l;

        System.out.println("The area of Rectangle is" + area +"cm²");
        
        System.out.println();
    }
}
