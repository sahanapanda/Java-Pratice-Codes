import java.io.*;

class GFG {

    // Function to find the largest of three numbers using if-else
    static int biggestOfThree(int x, int y, int z) {
        // Compare all three numbers
        if (x >= y && x >= z)
            // x is greater than or equal to both y and z
            return x;
        else if (y >= x && y >= z)
            // y is greater than or equal to both x and z
            return y;
        else
            // z is the largest number
            return z;
    }

    public static void main(String[] args) {
        // Declaring three numbers
        int a = 5;
        int b = 10;
        int c = 3;

        // Calling the function to find the largest number
        int largest = biggestOfThree(a, b, c);

        // Printing the largest number
        System.out.println(largest + " is the largest number.");
    }
}
