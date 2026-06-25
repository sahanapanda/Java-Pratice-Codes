//Juhi's Pizza Shop
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Mcost = 0, Corncost = 0, Pcost = 0, Ccost = 0, Bcost = 0;
        int Mquantity = 0, Cornquantity = 0, Pquantity = 0, Cquantity = 0, Bquantity = 0;

        System.out.print("WELCOME!\nWould you like to see Juhi's Pizza Shop Menu? (yes/no): ");
        String menu = input.nextLine();

        if (menu.equalsIgnoreCase("yes")) {

            System.out.println("\nJUHI'S PIZZA SHOP");
            System.out.println("1. Margherita Pizza - Rs.200");
            System.out.println("2. Corn and Onion Pizza - Rs.230");
            System.out.println("3. Paneer Tikka Pizza - Rs.270");
            System.out.println("4. Cheesy Chicken Pizza - Rs.290");
            System.out.println("5. BBQ Chicken Pizza - Rs.300");

            // Margherita
            System.out.print("\nWould you like to try Margherita Pizza? ");
            String M = input.nextLine();

            if (M.equalsIgnoreCase("yes")) {

                System.out.print("How many Margherita Pizzas would you like? ");
                Mquantity = input.nextInt();
                input.nextLine();

                System.out.print(
                    "Would you prefer any extra toppings?\n" +
                    "Cheese (+50)\n" + "Olives(+60)\n" + "Pineapple (+70)\n" + "Mushrooms (+80)\n" + "None\n" +"Enter topping: ");

                String Mextra = input.nextLine();

                Mcost = 200 * Mquantity;

                if (Mextra.equalsIgnoreCase("Cheese")) {
                    Mcost += 50 * Mquantity;
                } else if (Mextra.equalsIgnoreCase("Olives")) {
                    Mcost += 60 * Mquantity;
                } else if (Mextra.equalsIgnoreCase("Pineapple")) {
                    Mcost += 70 * Mquantity;
                } else if (Mextra.equalsIgnoreCase("Mushrooms")) {
                    Mcost += 80 * Mquantity;
                } 
                
            }

            // Corn and Onion
            System.out.print("\nWould you like to try Corn and Onion Pizza? ");
            String Corn = input.nextLine();

            if (Corn.equalsIgnoreCase("yes")) {

                System.out.print("How many Corn and Onion Pizzas would you like? ");
                Cornquantity = input.nextInt();
                input.nextLine();

                System.out.print(
                    "Would you prefer any extra toppings?\n" +
                    "Cheese (+50)\n" + "Olives(+60)\n" + "Pineapple (+70)\n" + "Mushrooms (+80)\n" + "None\n" +"Enter topping: ");

                String Cornextra = input.nextLine();

                Corncost = 230 * Cornquantity;

                if (Cornextra.equalsIgnoreCase("Cheese")) {
                    Corncost += 50 * Cornquantity;
                } else if (Cornextra.equalsIgnoreCase("Olives")) {
                    Corncost += 60 * Cornquantity;
                } else if (Cornextra.equalsIgnoreCase("Pineapple")) {
                    Corncost += 70 * Cornquantity;
                } else if (Cornextra.equalsIgnoreCase("Mushrooms")) {
                    Corncost += 80 * Cornquantity;
                }
            }
            
            //Paneer Tikka
            System.out.print("\nWould you like to try Paneer Tikka Pizza? ");
            String P = input.nextLine();

            if (P.equalsIgnoreCase("yes")) {

                System.out.print("How many Paneer Tikka Pizzas would you like? ");
                Pquantity = input.nextInt();
                input.nextLine();

                System.out.print(
                    "Would you prefer any extra toppings?\n" +
                    "Cheese (+50)\n" + "Olives(+60)\n" + "Pineapple (+70)\n" + "Mushrooms (+80)\n" + "None\n" +"Enter topping: ");

                String Pextra = input.nextLine();

                Pcost = 270 * Pquantity;

                if (Pextra.equalsIgnoreCase("Cheese")) {
                    Pcost += 50 * Pquantity;
                } else if (Pextra.equalsIgnoreCase("Olives")) {
                    Pcost += 60 * Pquantity;
                } else if (Pextra.equalsIgnoreCase("Pineapple")) {
                    Pcost += 70 * Pquantity;
                } else if (Pextra.equalsIgnoreCase("Mushrooms")) {
                    Pcost += 80 * Pquantity;
                }
            }
            
            // Cheesy Chicken
            System.out.print("\nWould you like to try Cheesy Chicken Pizza? ");
            String C = input.nextLine();

            if (C.equalsIgnoreCase("yes")) {

                System.out.print("How many Cheesy Chicken Pizzas would you like? ");
                Cquantity = input.nextInt();
                input.nextLine();

                System.out.print(
                    "Would you prefer any extra toppings?\n" +
                    "Cheese (+50)\n" + "Olives(+60)\n" + "Pineapple (+70)\n" + "Mushrooms (+80)\n" + "None\n" +"Enter topping: ");

                String Cextra = input.nextLine();

                Ccost = 290 * Cquantity;

                if (Cextra.equalsIgnoreCase("Cheese")) {
                    Ccost += 50 * Cquantity;
                } else if (Cextra.equalsIgnoreCase("Olives")) {
                    Ccost += 60 * Cquantity;
                } else if (Cextra.equalsIgnoreCase("Pineapple")) {
                    Ccost += 70 * Cquantity;
                } else if (Cextra.equalsIgnoreCase("Mushrooms")) {
                    Ccost += 80 * Cquantity;
                }
            }

            // BBQ Chicken
            System.out.print("\nWould you like to try BBQ Chicken Pizza? ");
            String B = input.nextLine();

            if (B.equalsIgnoreCase("yes")) {

                System.out.print("How many BBQ Chicken Pizzas would you like? ");
                Bquantity = input.nextInt();
                input.nextLine();

                System.out.print(
                    "Would you prefer any extra toppings?\n" +
                    "Cheese (+50)\n" + "Olives(+60)\n" + "Pineapple (+70)\n" + "Mushrooms (+80)\n" + "None\n" +"Enter topping: ");

                String Bextra = input.nextLine();

                Bcost = 300 * Bquantity;

                if (Bextra.equalsIgnoreCase("Cheese")) {
                    Bcost += 50 * Bquantity;
                } else if (Bextra.equalsIgnoreCase("Olives")) {
                    Bcost += 60 * Bquantity;
                } else if (Bextra.equalsIgnoreCase("Pineapple")) {
                    Bcost += 70 * Bquantity;
                } else if (Bextra.equalsIgnoreCase("Mushrooms")) {
                    Bcost += 80 * Bquantity;
                }
            }

            int total = Mcost + Corncost + Pcost + Ccost + Bcost;

            System.out.println("\n===== BILL =====");

            if (Mquantity > 0) {
                System.out.println(Mquantity + " Margherita Pizza - Rs." + Mcost);
            }

            if (Cornquantity > 0) {
                System.out.println(Cornquantity + " Corn and Onion Pizza - Rs." + Corncost);
            }
            
            if (Pquantity > 0) {
                System.out.println(Pquantity + " Paneer Tikka Pizza - Rs." + Pcost);
            }
            
            if (Cquantity > 0) {
                System.out.println(Cquantity + " Cheesy Chicken Pizza - Rs." + Ccost);
            }

            if (Bquantity > 0) {
                System.out.println(Bquantity + " BBQ Chicken Pizza - Rs." + Bcost);
            }

            System.out.println("-------------------------");
            System.out.println("Total Cost = Rs." + total);
            System.out.println("Thank you for ordering from Juhi's Pizza Shop!");

        } else {
            System.out.println("THANK YOU");
        }

        input.close();
    }
}
