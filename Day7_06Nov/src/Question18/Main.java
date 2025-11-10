package Question18;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int id ;
    private String name;

    Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double calcSalary(){
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + calcSalary());
    }
}

class FullTimeEmployee extends Employee{
    private double baseSalary;
    private double hra;  // House Rent Allowance
    private double da;   // Dearness Allowance
    private double bonus;
    public FullTimeEmployee(int id , String name , double baseSalary , double hra , double da , double bonus){
      super(id,name);
      this.bonus=bonus;
      this.baseSalary=baseSalary;
      this.hra=hra;
      this.da=da;
    }

    public double calcSalary(){
        double total = baseSalary + hra + da + bonus;
        return total;
    }
}
class PartTimeEmployee extends Employee{
    private  int hoursWorked;
    private int hourlyPay;

    public PartTimeEmployee(int id , String name , int hoursWorked , int hourlyPay){
        super(id , name);
        this.hoursWorked=hoursWorked;
        this.hourlyPay=hourlyPay;
    }
    @Override
    public double calcSalary(){
        return hourlyPay*hoursWorked;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Lalit Kumar", 30000, 5000, 4000, 3000));
        employees.add(new FullTimeEmployee(2, "Karan Singh", 40000, 7000, 5000, 4000));

        // Part-time employees: (id, name, hours, rate)
        employees.add(new PartTimeEmployee(3, "Ravi Sharma", 80, 300));
        employees.add(new PartTimeEmployee(4, "Anita Verma", 60, 250));

        System.out.println("=== Employee Salary Details ===");
        for(Employee e : employees){
            System.out.println(e.getName()+" Salary:"+e.calcSalary());
        }
    }
}
