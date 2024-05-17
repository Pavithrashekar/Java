package Q6_Collection_shoppingCart;

public class GroceryItem {
	

	
	    private String name;
	    private double price;

	    public GroceryItem(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

		@Override
	    public String toString() {
	        return name + " - Rs " + price;
	    }
	}

