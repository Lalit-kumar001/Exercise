package Question9;

import java.sql.SQLOutput;
import java.util.Scanner;

class MathUtils{
    public static int max(int a, int b){
        return (a>b) ? a:b;
    }
    public static int min(int a , int b ){
        return (a>b) ? b : a;
    }

    public static double average(int a , int b){
        return (a+b)/2.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathUtils m = new MathUtils();

        System.out.println("Enter first Number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println("Max:"+m.max(num1,num2));
        System.out.println("Min:"+m.min(num1,num2));
        System.out.println("Average:"+m.average(num1,num2));


    }
}
