package Question6;
class TablePrinter{
    private boolean turnOfTwo = true;
    private  final Object obj = new Object();
    synchronized void printTwo(){

        for(int i=1;i<=10;i++){
            while(!turnOfTwo){
            try {
             wait();
            }
        catch (InterruptedException e ){
         System.out.println(e.getMessage());
}
            }
            System.out.println("2"+" x "+i+" = "+2*i);
            turnOfTwo=false;
            notify();
        }
    }

    synchronized void printFour(){
        for(int i=1;i<=10;i++){
            while(turnOfTwo){
                try {
                    wait();
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("4"+" x "+i+" = "+4*i);
            turnOfTwo=true;
            notify();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        TablePrinter tb = new TablePrinter();
        Thread t1 = new Thread(()->tb.printTwo());
        Thread t2 = new Thread(()->tb.printFour());

        t1.start();
        t2.start();
    }
}
