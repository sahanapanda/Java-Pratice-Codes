import java.util.Vector;

public class VectorCapacityExample1 {
    public static void main(String[] args) {
        // Create an empty Vector with an initial capacity of 15
        Vector<Integer> vecObject = new Vector<Integer>(15);

        // Add values to the vector
        vecObject.add(3);
        vecObject.add(5);
        vecObject.add(2);
        vecObject.add(4);
        vecObject.add(1);

        // Display the current capacity of the vector
        System.out.println("Current capacity of Vector is: " + vecObject.capacity());
         System.out.println("Current capacity of Vector is: " + vecObject.size());
    }
}
