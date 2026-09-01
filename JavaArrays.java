public class JavaArrays {
    public static void main(String[] args) {
        
        //Primitive Array
        int a[] = {10,20,30,40,50};

        System.out.print("Elements of the Primitive Array are : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        //Non Primitive Array
        String b[] = {"Sahana","Joy","Ayush"};

        System.out.print("\nElements of the Non Primitive Array are : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
