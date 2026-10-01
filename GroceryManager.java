import java.util.Scanner;

/**
 * A simple grocery management system that tracks item names, prices,
 * and stock levels using parallel arrays, where the same index in each
 * array refers to the same item.
 *
 * @author Group 14: Anthony Tijerina, Ezea Ede, Muhammad Musa, Daniel Garcia 
 * @version 1.0
 */
public class GroceryManager {

    /**
     * Entry point. Initializes the inventory arrays and runs the user menu.
     * The main mehtod runs a continuous command-line menu allowing the user to view
     * inventory, restock items, or exit the program.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Test items doesnt need to be in main code.
        itemNames[0] = "Apples";
        itemPrices[0] = 0.99;
        itemStocks[0] = 50;

        itemNames[1] = "Notebook";
        itemPrices[1] = 3.49;
        itemStocks[1] = 20;

        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        while (true) {
            // Main menu display of choices
            System.out.println("\n=== Inventory Menu ===");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Select an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            if (choice == 1) {
                // Call Method from task 1
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                // Gather details for Task 2
                System.out.print("Enter the name of the item to restock: ");
                String target = scanner.nextLine();
                System.out.print("Enter the amount to add: ");
                int amount = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                // Call Task 2 method
                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3) {
                System.out.println("Exiting application. Goodbye!");
                break; // Breaks the while(true) loop
            } else {
                System.out.println("Invalid option. Please choose 1, 2, or 3."); // Restate the menu
            }
        }
        scanner.close();
    }

    /**
     * Prints every non-empty slot in the inventory.
     *
     * @param names  item names
     * @param prices item prices
     * @param stocks item stock counts
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(
                    "Item: " + names[i]
                    + " | Price: $" + prices[i]
                    + " | Stock: " + stocks[i]
                );
            } else {
                continue;
            }
        }
    }

    /**
     * Searches for an item by name and adds the given amount to its stock.
     * Prints "Item not found." if no match exists.
     *
     * @param names  item names
     * @param stocks item stock counts
     * @param target the item name to search for
     * @param amount the quantity to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                stocks[i] += amount;
                return;
            }
        }
        System.out.println("Item not found.");
    }
}
