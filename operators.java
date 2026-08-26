import java.util.Scanner;
public class operators {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Enter number : ");
       int n = input.nextInt();

       if (n >0 && n%3==0 && n%5==0){
        int bitwise_and = n & 15;
        int bitwise_or = n | 15;
        System.out.printf("Bitwise AND = %d\n", bitwise_and);
        System.out.printf("Bitwise OR = %d", bitwise_or);
        }
      else{
        System.out.println("Failed");
      }
    }
}
