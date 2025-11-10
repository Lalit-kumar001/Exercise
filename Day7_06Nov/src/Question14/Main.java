package Question14;

public class Main {
    public static void m3(){
        System.out.println("Insode m3");
        double result = 10/0;
        System.out.println("Result:"+result);
    }

    public static void m2(){
        System.out.println("Insode m2");
        m3();
    }

    public static void m1(){
        System.out.println("Insode m1");
        try{
            m2();
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught in m1():"+e.getMessage());
        }

    }


    public static void main(String[] args) {
        System.out.println("=== Exception Propagation Example ===");
        m1();
        System.out.println("Program ended normally.");
    }
}
