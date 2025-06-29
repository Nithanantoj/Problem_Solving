package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Product obj = new Product("Pen", 10.00);

        System.out.println(obj.getProductName() + " " + obj.getPrice());
    }
}
