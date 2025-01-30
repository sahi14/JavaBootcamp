import java.util.Scanner;

public class PizzaDelivery {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("how many pizza toppings you want?");
        int numToppings = scan.nextInt();
        scan.nextLine();

        System.out.println("Great, enter each topping!");

        String[] toppings = new String[numToppings];

        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". ");
            toppings[i] = scan.nextLine();
            System.out.println();
        }

        // Task 1 

        System.out.println("\nThank you! Here are the toppings you ordered");

        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }                        


        // Task 2 

        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    
    }
    
}
