package Question16;
import java.util.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Customer {
    private int id;
    private String name;
    private String email;

    // Constructor
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create 3 Customer objects
        Customer c1 = new Customer(1, "Lalit Kumar", "lalit@gmail.com");
        Customer c2 = new Customer(2, "Ravi Sharma", "ravi@gmail.com");
        Customer c3 = new Customer(3, "Anita Verma", "anita@gmail.com");

        // Store them in a list
        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        // Print all customers
        System.out.println("=== Customer Details ===");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
