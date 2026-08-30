import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = input.nextInt();
        int i;
        int count = 0;
        int flag = 0;


        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }


            if(i*i==n){
                flag = 1;
            }
        }


        if(count == 2 || flag == 1){
            System.out.println("False");
        }


        else{
            System.out.println("True");
        }


        input.close();
    }
}
