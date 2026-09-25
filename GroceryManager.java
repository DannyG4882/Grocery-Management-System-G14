import java.util.Scanner;

/**
 * A simple grocery management system that tracks item names, prices,
 * and stock levels using parallel arrays, where the same index in each
 * array refers to the same item.
 *
 * @author Group 14: Anthony Tijerina, ..., 
 * @version 1.0
 */
public class GroceryManager {

    /**
     * Entry point. Initializes the inventory arrays and runs the user menu.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // TODO (feature-menu): Scanner + while(true) menu
    }

    /**
     * Prints every non-empty slot in the inventory.
     *
     * @param names  item names
     * @param prices item prices
     * @param stocks item stock counts
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        // TODO (feature-display)
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
        // TODO (feature-restock)
    }
}