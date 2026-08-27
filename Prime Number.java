import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = input.nextInt();
        int i;
        int count = 0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }


        if(count==2){
            System.out.printf("%d is a Prime Number",n);
        }


        else{
            System.out.printf("%d is not a Prime Number",n);
        }


        input.close();
    }
}


