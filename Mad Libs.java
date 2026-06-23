//MAD LIBS GAMES
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        String noun1;
        String adjective1;
        String verb1;
        String noun2;
        String adjective2;
         
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun (name) : ");
        noun1 = input.nextLine();
        System.out.print("Enter an adjective (qualitative) : ");
        adjective1 = input.nextLine();
        System.out.print("Enter a verb (action) : ");
        verb1 = input.nextLine();
        System.out.print("Enter a noun (animal): ");
        noun2 = input.nextLine();
        System.out.print("Enter an adjective (quantitative) : ");
        adjective2 = input.nextLine();
        
        System.out.println("There was a person named " + noun1 + ".");
        System.out.println(noun1 + " lived in a " + adjective1 + " neighbourhood.");
        System.out.println("Every morning " + noun1 + " used to " + verb1 + ".");
        System.out.println(noun1 + " had a pet " + noun2 + " who had " + adjective2 + " " + noun2 + " friends.");
        input.close();
    }
}
