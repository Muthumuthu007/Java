class Prod {
    private String itemno;
    private String name;
    private double price;
    private short qty;

    // Constructor to initialize the variables
    public Prod(String item, String name1, double price1, short qtty) {
        this.itemno = item;
        this.name = name1;
        this.price = price1;
        this.qty = qtty;
    }

    // Getter methods
    public String getItemNumber() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return qty;
    }

    // Setter method for price (should return void, not double)
    public void setPrice(double price) {
        this.price = price;
    }
}

public class product {
    public static void main(String[] args) {
        // Corrected instantiation of Prod object with string literals and correct data types
        Prod p1 = new Prod("jhdf64", "muthu", 32.0, (short) 34);

        // Example of using getter methods
        System.out.println("Item Number: " + p1.getItemNumber());
        System.out.println("Name: " + p1.getName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("Quantity: " + p1.getQuantity());

        // Example of using setter method
        p1.setPrice(35.0);
        System.out.println("Updated Price: " + p1.getPrice());
    }
}
