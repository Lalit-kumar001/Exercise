import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Buffer {
    int bufferSize = 5;
    LinkedList<Integer> list = new LinkedList<>();


    synchronized void produce(int value){
        while(list.size() == bufferSize){
            try{
                wait();
            } catch(Exception e){}
        }

        list.add(value);

        System.out.println("Produced -> " + value);
        notify();
    }

    synchronized void consume(){
        while(list.isEmpty()){
            try{
                wait();
            } catch(Exception e){}
        }

        int value = list.removeFirst();

        System.out.println("Consumed -> " + value);
        notify();
    }

}

class Producer implements Runnable{
    Buffer buffer;

    Producer(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run(){
        for(int i = 1; i <= 50; i++){
            try{
                buffer.produce(i);
            }
            catch(Exception e){}
        }
    }
}

class Consumer implements Runnable{
    Buffer buffer;

    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 50; i++){
            try{
                buffer.consume();
            }
            catch(Exception e){}
        }
    }
}


public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Runnable producer = new Producer(buffer);
        Runnable consumer = new Consumer(buffer);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();


        System.out.println("hello");
    }
}