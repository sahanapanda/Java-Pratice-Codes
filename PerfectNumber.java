import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = input.nextInt();
        int i;
        int sum = 0;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }


        if(sum==n){
            System.out.printf("%d is a Perfect Number",n);
        }


        else{
            System.out.printf("%d is not a Perfect Number",n);
        }


        input.close();
    }
}



