package Encapsulation;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price){
        this.productName = productName;
        setPrice(price);
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else {
            System.out.println("Invalid price");
        }
    }
}
