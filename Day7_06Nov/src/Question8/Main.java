package Question8;
class Counter{
    private static int objectCounter;

    public Counter(){
        objectCounter++;
    }

    public static void showCount(){
        System.out.println("Total objects created: "+objectCounter);
    }
}
public class Main {
    public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();

    Counter.showCount();
    }
}
