package homeworks.homework4;

// 1.Product Initialization
public class Product {

    public static String companyName;
    public int productID = 1000;
    public String productName;


    static {
        companyName = "MyCompany";
    }


    {
        productID++;
    }

    public Product(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Company name = "+ companyName + "\nProduct name = " + productName + "\nid = " + productID;
    }
}
