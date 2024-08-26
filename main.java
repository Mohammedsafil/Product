package Product;

public class main {
    public static void main(String[] args){
        Product p = new Electronics("Mobile", 12000, "Redmi", "jan-2025");
        p.displayDetails();

        p = new Clothing("T-Shirt", 500, "Nike", "M");
        p.displayDetails();

        p = new Food("Whey Protein", 3000, "Muscle Blaze", "20-12-2024");
        p.displayDetails();
    }
}


class Product{
    private String productName;
    private double productPrice;
    private String brand;

    public Product(String productName, double productPrice, String brand){
        this.productName = productName;
        this.productPrice = productPrice;
        this.brand = brand;
    }

    public void displayDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Brand: " + brand);
    }
}

class Electronics extends Product{
    private String warrantyPeriod;

    public Electronics(String productName, double productPrice, String brand, String warrantyPeriod){
        super(productName, productPrice, brand);
        this.warrantyPeriod = warrantyPeriod;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty Period: "+ warrantyPeriod);
    }
}

class Clothing extends Product{
    private String size;

    public Clothing(String productName,double productPrice, String brand, String size){
        super(productName, productPrice, brand);
        this.size = size;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size: "+ size);
    }
}

class Food extends Product{
    private String expirationDate;

    public Food(String productName, double productPrice, String brand, String expirationDate){
        super(productName, productPrice, brand);
        this.expirationDate = expirationDate;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Expiration Date: "+ expirationDate);
    }
}