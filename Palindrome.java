import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = input.nextInt();


        int digit;
        int rev=0;
        int og = n;
        do{
            digit = n%10;
            rev = rev*10 + digit;
            n = n/10;


        }while(n>0);


        if(og==rev)
        System.out.printf("%d is a Palindrome number", og);


        else
        System.out.printf("%d is Not a Palindrome number", og);


        input.close();
    }
}
