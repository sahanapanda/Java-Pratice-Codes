public class ProductInventory {

    int productId;
    String productName;
    double productPrice;

    ProductInventory() {
        this(101, "Keyboard", 850.0);
        System.out.println("Default Constructor Executed");
    }

    ProductInventory(int id) {
        this(id, "Mouse", 450.0);
        System.out.println("One Parameter Constructor Executed");
    }

    ProductInventory(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;

        System.out.println("Three Parameter Constructor Executed");
    }

    void display() {
        System.out.println("---------------------------");
        System.out.println("Product ID    : " + productId);
        System.out.println("Product Name  : " + productName);
        System.out.println("Product Price : " + productPrice);
    }

    public static void main(String[] args) {

        ProductInventory p1 = new ProductInventory();
        ProductInventory p2 = new ProductInventory(202);
        ProductInventory p3 = new ProductInventory(303, "Monitor", 12500);

        ProductInventory p4 = p3;

        p1.display();
        p2.display();
        p3.display();

        System.out.println("\nUsing another reference variable (p4)");
        p4.display();
    }
}
