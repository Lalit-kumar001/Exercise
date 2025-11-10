package Question5;
import java.util.Scanner;

class DivideByZeroException extends Exception{
  public  DivideByZeroException(String msg){
        super(msg);
    }
}
class Calculator{

    public double Add(double a , double b){
        return a+b;
    }

    public double Subtract(double a , double b){
        return a-b;
    }
    public double Multiply(double a , double b){
        return a*b;
    }

    public double Devide(double a , double b) throws DivideByZeroException{
        if(b==0){
            throw  new DivideByZeroException("Can't divide by 0");
        }
        return a/b;
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        double  result =0;
        switch (op){

            case '+':
               result= calc.Add(num1,num2);
               break;
            case '-':
                result = calc.Subtract(num1,num2);
                break;

            case '*':
                result = calc.Multiply(num1,num2);
                break;

            case '/':
                try{
                    result = calc.Devide(num1,num2);
                }
                catch (DivideByZeroException e) {
                    System.out.println(e.getMessage());
                }

            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
