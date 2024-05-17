package Q6_Collection_shoppingCart;
import java.util.*;
public class ShoppingList {
	

	

	
	    private ArrayList<GroceryItem> items = new ArrayList<>();

	    public void addItem(GroceryItem item) {
	        items.add(item);
	        System.out.println(item + " added to shopping list.");
	    }

	    public void removeItem(int index) {
	        if (index >= 0 && index < items.size()) {
	            GroceryItem removedItem = items.remove(index);
	            System.out.println(removedItem + " removed from shopping list.");
	        } else {
	            System.out.println("Invalid item index.");
	        }
	    }

	    public void viewList() {
	        System.out.println("Shopping List:");
	        for (GroceryItem item : items) {
	            System.out.println(item);
	        }
	    }

	    public void clearList() {
	        items.clear();
	        System.out.println("Shopping list cleared.");
	    }
	}


