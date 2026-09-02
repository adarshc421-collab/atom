public class FoodItem {
    // Private fields for encapsulation
    private String name;
    private int id;
    private double price;
    private int qty;

    // Constructor with validation
    public FoodItem(int id, String name, double price, int qty) {
        setId(id);
        setName(name);
        setPrice(price);
        setQty(qty);
    }

    // Getters and setters with validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }
        this.name = name.trim();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.qty = qty;
    }

    // Method to calculate bill for this item
    public double calculateBill() {
        return price * qty;
    }

    // Display item details
    public void displayItem() {
        System.out.printf("ID: %d | Name: %s | Price: ₹%.2f | Qty: %d | Bill: ₹%.2f%n",
                id, name, price, qty, calculateBill());
    }

    // Main method for quick testing
    public static void main(String[] args) {
        try {
            FoodItem item = new FoodItem(101, "Adarsh", 120.50, 3);
            item.displayItem();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
