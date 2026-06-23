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
            System.out.println("4. Cheesy Chicken Pizza - Rs.280");
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
                    "Cheese (+50)\n" + "Olives(+60)" + "Paneer (+70)\n" + "Chicken (+80)\n" + "None\n" +"Enter topping: ");

                String Mextra = input.nextLine();

                Mcost = 200 * Mquantity;

                if (Mextra.equalsIgnoreCase("Cheese")) {
                    Mcost += 50;
                } else if (Mextra.equalsIgnoreCase("Olives")) {
                    Mcost += 60;
                } else if (Mextra.equalsIgnoreCase("Paneer")) {
                    Mcost += 70;
                } else if (Mextra.equalsIgnoreCase("Chicken")) {
                    Mcost += 80;
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
                    "Cheese (+50)\n" + "Olives(+60)" + "Paneer (+70)\n" + "Chicken (+80)\n" + "None\n" +"Enter topping: ");

                String Cornextra = input.nextLine();

                Corncost = 230 * Cornquantity;

                if (Cornextra.equalsIgnoreCase("Cheese")) {
                    Corncost += 50;
                } else if (Cornextra.equalsIgnoreCase("Olives")) {
                    Corncost += 60;
                } else if (Cornextra.equalsIgnoreCase("Paneer")) {
                    Corncost += 70;
                } else if (Cornextra.equalsIgnoreCase("Chicken")) {
                    Corncost += 80;
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
                    "Cheese (+50)\n" + "Olives(+60)" + "Paneer (+70)\n" + "Chicken (+80)\n" + "None\n" +"Enter topping: ");

                String Pextra = input.nextLine();

                Pcost = 270 * Pquantity;

                if (Pextra.equalsIgnoreCase("Cheese")) {
                    Pcost += 50;
                } else if (Pextra.equalsIgnoreCase("Olives")) {
                    Pcost += 60;
                } else if (Pextra.equalsIgnoreCase("Paneer")) {
                    Pcost += 70;
                } else if (Pextra.equalsIgnoreCase("Chicken")) {
                    Pcost += 80;
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
                    "Cheese (+50)\n" + "Olives(+60)" + "Paneer (+70)\n" + "Chicken (+80)\n" + "None\n" +"Enter topping: ");

                String Cextra = input.nextLine();

                Ccost = 290 * Cquantity;

                if (Cextra.equalsIgnoreCase("Cheese")) {
                    Ccost += 50;
                } else if (Cextra.equalsIgnoreCase("Olives")) {
                    Ccost += 60;
                } else if (Cextra.equalsIgnoreCase("Paneer")) {
                    Ccost += 70;
                } else if (Cextra.equalsIgnoreCase("Chicken")) {
                    Ccost += 80;
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
                    "Cheese (+50)\n" + "Olives(+60)" + "Paneer (+70)\n" + "Chicken (+80)\n" + "None\n" +"Enter topping: ");

                String Bextra = input.nextLine();

                Bcost = 300 * Bquantity;

                if (Bextra.equalsIgnoreCase("Cheese")) {
                    Bcost += 50;
                } else if (Bextra.equalsIgnoreCase("Olives")) {
                    Bcost += 60;
                } else if (Bextra.equalsIgnoreCase("Paneer")) {
                    Bcost += 70;
                } else if (Bextra.equalsIgnoreCase("Chicken")) {
                    Bcost += 80;
                }
            }

            int total = Mcost + Corncost + Pcost + Ccost + Bcost;

            System.out.println("\n===== BILL =====");

            if (Mquantity > 0) {
                System.out.println(Mquantity + " Margherita Pizza");
            }

            if (Cornquantity > 0) {
                System.out.println(Cornquantity + " Corn and Onion Pizza");
            }
            
            if (Pquantity > 0) {
                System.out.println(Pquantity + " Paneer Tikka Pizza");
            }
            
            if (Cquantity > 0) {
                System.out.println(Cquantity + " Cheesy Chicken Pizza");
            }

            if (Bquantity > 0) {
                System.out.println(Bquantity + " BBQ Chicken Pizza");
            }

            System.out.println("Total Cost = Rs." + total);
            System.out.println("Thank you for ordering from Juhi's Pizza Shop!");

        } else {
            System.out.println("THANK YOU");
        }

        input.close();
    }
}
