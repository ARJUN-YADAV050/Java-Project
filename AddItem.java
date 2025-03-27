package SupermarketBillingSystem;

public class AddItem {
	
	public static void addItemToCart(Map<String, SupermarketBilling.Item> cart, String itemName, int quantity, double pricePerUnit) {
        if (cart.containsKey(itemName)) {
            SupermarketBilling.Item existingItem = cart.get(itemName);
            existingItem.quantity += quantity;
        } else {
            cart.put(itemName, new SupermarketBilling.Item(itemName, quantity, pricePerUnit));
        }
        System.out.println(quantity + " " + itemName + "(s) added to the cart.");
    }

}
