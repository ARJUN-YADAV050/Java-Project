package SupermarketBillingSystem;

import java.util.HashMap;
import java.util.Map;

public class SupermarketBilling implements BillingSystem {

	protected final Map<String, Item> cart = new HashMap<>();

    @Override
    public void addItem(String itemName, int quantity, double pricePerUnit) {
        AddItem.
(cart, itemName, quantity, pricePerUnit);
    }

    @Override
    public void removeItem(String itemName) {
        if (cart.remove(itemName) != null) {
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " is not in the cart.");
        }
    }

    @Override
    public void generateBill() {
        double total = 0;
        System.out.println("--------- Supermarket Bill ---------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Item", "Quantity", "Price/Unit", "Total");
        for (Item item : cart.values()) {
            double itemTotal = item.quantity * item.pricePerUnit;
            total += itemTotal;
            System.out.printf("%-20s %-10d %-10.2f %-10.2f\n", item.name, item.quantity, item.pricePerUnit, itemTotal);
        }
        System.out.println("-------------------------------------");
        System.out.printf("Total: %.2f\n", total);
    }

    // Inner class to represent items
    protected static class Item {
        String name;
        int quantity;
        double pricePerUnit;

        Item(String name, int quantity, double pricePerUnit) {
            this.name = name;
            this.quantity = quantity;
            this.pricePerUnit = pricePerUnit;
        }
    }
	
}
