package Question10;

import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private int price;

    public Book(String title , String author , int price){
        this.title = title;
        this.price=price;
        this.author=author;
    }
    public  void display(){
        System.out.println("Book Information");
        System.out.println("Title of Book:"+this.title);
        System.out.println("Author of Book:"+this.author);
        System.out.println("Price of Book:"+this.price);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of Book");
        String title = sc.nextLine();
        System.out.println("Enter Author of Book");
        String author = sc.nextLine();
        System.out.println("Enter price of book");
        int price = sc.nextInt();
        Book b = new Book(title,author,price);
        b.display();

    }
}
