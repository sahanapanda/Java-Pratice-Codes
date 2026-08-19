public class PrintNumbers{
    public static void main(String[] args){

        for(int i = 1; i <=50; i++) {
            if (i%5 == 0){
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}

public class PrintNumbers{
    public static void main(String[] args){

        for(int i = 1; i <=50; i++){
            System.out.printf("%d ", i);
            
            if (i == 35){
                break;
            }
        }
    }
}
