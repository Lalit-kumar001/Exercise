package Question6;

import java.util.Scanner;

class Student{
    private String name;
    private int mark1,mark2 , mark3;

    public Student(String name , int mark1 , int mark2 , int mark3){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    public int getTotal(){
        return  mark1+mark2+mark3;
    }
    public double getAverage(){
        return getTotal()/3.0;
    }
    public  void displayReport(){
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Average Marks: " + getAverage());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        Student s = new Student(name,m1,m2,m3);
        System.out.println("Total marks:"+s.getTotal());
        s.displayReport();
    }
}
