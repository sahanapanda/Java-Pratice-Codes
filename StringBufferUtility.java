public class StringBufferUtility {
    public static void main(String[] args) {

        // 1. StringBuffer construction
        StringBuffer text = new StringBuffer("Java");
        System.out.println("Original String: " + text);

        // 2. Append
        text.append(" Programming");
        System.out.println("\nAfter append(): " + text);

        // 3. Insert
        text.insert(5, "Object Oriented ");
        System.out.println("After insert(): " + text);

        // 4. Reverse
        text.reverse();
        System.out.println("After reverse(): " + text);

        // Reverse again to restore original order
        text.reverse();
        System.out.println("After reversing again: " + text);

        // 5. Delete
        text.delete(5, 21);
        System.out.println("After delete(): " + text);

        // 6. Replace
        text.replace(5, 17, "Development");
        System.out.println("After replace(): " + text);
    }
}
