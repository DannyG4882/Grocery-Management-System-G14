# Grocery-Management-System-G14

## Project Description

This project is a simple grocery management system written in Java. The program uses parallel arrays to store item names, prices, and stock quantities. Each index across the three arrays represents the same grocery item.

The purpose of this assignment is to practice Java programming, GitHub collaboration, branching, merging, documentation, and team-based software development.

## How the Program Works

When the program starts, the user is shown an inventory menu with three options:

1. View Inventory
2. Restock Item
3. Exit

### View Inventory

The program loops through the inventory arrays and displays each non-empty item along with its price and current stock quantity.

### Restock Item

The user enters the name of an existing item and the amount they would like to add to its stock. The program searches the inventory for the item and updates its stock quantity.

If the item cannot be found, the program displays:

`Item not found.`

### Exit

The Exit option ends the program.

## Parallel Array Structure

The inventory is stored using three parallel arrays:

```java
String[] itemNames = new String[10];
double[] itemPrices = new double[10];
int[] itemStocks = new int[10];

## UML Class Diagram

![GroceryManager UML Class Diagram](GroceryManager-UML.png)
