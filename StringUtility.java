import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {

        // 1. String construction
        String text1 = "Java Programming";
        String text2 = new String("Java Programming");

        System.out.println("Text 1: " + text1);
        System.out.println("Text 2: " + text2);

        // 2. String comparison
        System.out.println("\n--- String Comparison ---");
        System.out.println("Using equals(): " + text1.equals(text2));
        System.out.println("Using ==: " + (text1 == text2));
        System.out.println("Using compareTo(): " + text1.compareTo(text2));

        // 3. Searching
        System.out.println("\n--- Searching ---");
        System.out.println("Length: " + text1.length());
        System.out.println("Character at index 5: " + text1.charAt(5));
        System.out.println("Index of 'Programming': "
                + text1.indexOf("Programming"));
        System.out.println("Contains 'Java': "
                + text1.contains("Java"));

        // 4. Case conversion
        System.out.println("\n--- Case Conversion ---");
        System.out.println("Uppercase: " + text1.toUpperCase());
        System.out.println("Lowercase: " + text1.toLowerCase());

        // 5. Split
        System.out.println("\n--- Split ---");
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");

        System.out.println("Words after splitting:");

        for (String word : words) {
            System.out.println(word);
        }

        // 6. Join
        System.out.println("\n--- Join ---");
        String joinedText = String.join("-", words);
        System.out.println("Joined String: " + joinedText);
    }
}
