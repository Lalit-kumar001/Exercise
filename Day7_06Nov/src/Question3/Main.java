package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //factorial

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int fact= 1;

        for(int i=num;i>=1;i--){
           fact*=i;
        }
        System.out.println("Factorial of a Number:"+fact);
    }
}
