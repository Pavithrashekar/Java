package Q6_Collection_shoppingCart;
import java.util.Scanner;
import java.util.ArrayList;
public class shoppingMain {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ShoppingList shoppingList = new ShoppingList();
	        ArrayList<GroceryItem> groceryItems = new ArrayList<>();
	        groceryItems.add(new GroceryItem("Milk", 51));
	        groceryItems.add(new GroceryItem("Bread", 25));
	        groceryItems.add(new GroceryItem("Eggs", 7));
	        groceryItems.add(new GroceryItem("Apples", 80));
	        groceryItems.add(new GroceryItem("Bananas", 60));
	        groceryItems.add(new GroceryItem("Snacks", 20));
	        groceryItems.add(new GroceryItem("Biscuits", 30));

	        System.out.println("Welcome to the grocery shopping list!");
	        while (true) {
	            System.out.println("1. Add item to list");
	            System.out.println("2. Remove item from list");
	            System.out.println("3. View shopping list");
	            System.out.println("4. Clear shopping list");
	            System.out.println("5. End shopping");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Available items:");
	                    for (int i = 0; i < groceryItems.size(); i++) {
	                        System.out.println((i + 1) + ". " + groceryItems.get(i));
	                    }
	                    System.out.print("Enter the item number to add: ");
	                    int addItemIndex = scanner.nextInt() - 1;
	                    if (addItemIndex >= 0 && addItemIndex < groceryItems.size()) {
	                        shoppingList.addItem(groceryItems.get(addItemIndex));
	                    } else {
	                        System.out.println("Invalid item number.");
	                    }
	                    System.out.println();
	                    break;
	                case 2:
	                    shoppingList.viewList();
	                    System.out.print("Enter the index of item to remove: ");
	                    int removeItemIndex = scanner.nextInt() - 1;
	                    shoppingList.removeItem(removeItemIndex);
	                    System.out.println();
	                    break;
	                case 3:
	                    shoppingList.viewList();
	                    System.out.println();
	                    break;
	                case 4:
	                    shoppingList.clearList();
	                    System.out.println();
	                    break;
	                case 5:
	                    System.out.println("Thank you for using the grocery shopping list!");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

