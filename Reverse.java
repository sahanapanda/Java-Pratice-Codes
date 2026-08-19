import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        int digit;
        int rev = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the vehicle number : ");
        int n = input.nextInt();

        while(n>0){
            digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }

        System.out.println("Mirror image number : " + rev);

        input.close();


    }
}
