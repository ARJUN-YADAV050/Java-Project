package SupermarketBillingSystem;

public class SupermarketBillingSystem {

	 public static void main(String[] args) {
	        BillingSystem billingSystem = new SupermarketBilling();

	        // Adding items to the cart
	        billingSystem.addItem("Apples", 2, 3.50);
	        billingSystem.addItem("Milk", 1, 1.20);
	        billingSystem.addItem("Bread", 1, 2.00);

	        // Removing an item
	        billingSystem.removeItem("Milk");

	        // Adding more items
	        billingSystem.addItem("Eggs", 12, 0.20);

	        // Generating the final bill
	        billingSystem.generateBill();
	    }
}
