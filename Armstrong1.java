import java.util.Scanner;


public class Print {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter Number : ");
        int n = input.nextInt();


        int og = n;
        int temp = n;
        int count = 0;
        int sum = 0;


        // Count the number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }


        temp = n;


        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;


            int power = 1;


            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }


            sum = sum + power;
            temp = temp / 10;
        }


        if (sum == og) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        input.close();
    }
}
