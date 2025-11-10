package Question19;

import java.util.ArrayList;
import java.util.List;

class InvalidPriceException extends Exception{
    public InvalidPriceException(String msg){
        super(msg);
    }
}

class Product {
    private int id ;
    private String name;
    private int price;

    public Product(int id , String name , int price) throws InvalidPriceException{
        this.id=id;
        this.name=name;
        if(price<=0){
            throw new InvalidPriceException("Invalid price for product '" + name + "': Price cannot be negative!");
        }
        else {
            this.price = price;
        }
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public  String toString(){
        return "Product Details: [ProductName:"+this.name+" ProductPrice=₹:"+this.price+"]";
    }
}
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        try {
            products.add(new Product(1, "Laptop", 55000));
            products.add(new Product(2, "Headphones", 2500));
            products.add(new Product(3, "Mouse", 800));
            products.add(new Product(4, "Keyboard", -1000)); // Invalid (throws exception)
            products.add(new Product(5, "Monitor", 12000));
        }
        catch (InvalidPriceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n=== Product List ===");
        for (Product p : products) {
            System.out.println(p);
        }

    }
}
