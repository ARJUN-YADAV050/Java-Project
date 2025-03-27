package SupermarketBillingSystem;

public interface BillingSystem {
	
	void addItem(String itemName, int quantity, double pricePerUnit);
    void removeItem(String itemName);
    void generateBill();

}
