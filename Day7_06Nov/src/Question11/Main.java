package Question11;
class Car {
    private String model;
    private double price;

    // Constructor 1 sets only model
    public Car(String model) {
        this.model = model;
        this.price = 0.0;
    }

    // Constructor 2 sets model and price
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }


    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tata Nexon");
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        System.out.println();

        // Using second constructor
        Car car2 = new Car("Hyundai Creta", 1450000);
        System.out.println("Car 2 Details:");
        car2.displayInfo();
    }
}
