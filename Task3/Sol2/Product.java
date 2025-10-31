package Task3.Sol2;

public class Product implements Taxable {
    int pId;
    double price;
    int quantity;
    public Product() {

    }
    public Product(int pId, double price, int quantity) {
        this.pId = pId;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double taxAmount = price * salesTax;
        System.out.println("Sales tax amount for product ID " + pId + " is Rs." + taxAmount);
    }
}
