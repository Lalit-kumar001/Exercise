package Question12;


import java.util.Scanner;

class DivideByZeroException extends Exception{
    public DivideByZeroException(String msg){
        super(msg);
    }
}
class Divide{
    public double divide(int a, int b) throws  DivideByZeroException{
        if(b==0){
            throw new  DivideByZeroException("Divide by zero is Not valid");
        }
        return a/b;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n2 = sc.nextInt();

        Divide d = new Divide();
        try{
            double result = d.divide(n1,n2);
            System.out.println("Result:"+result);
        }
        catch (DivideByZeroException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Division completed");
        }

    }
}
