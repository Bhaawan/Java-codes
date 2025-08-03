
import java.io.IOException;

class Counter{
    int count;

    public synchronized void incrementCount(){
        count++;
    }
}

public class Demo{
    public static void main(String args[]) throws IOException{

        Counter c=new Counter();

        Runnable obj1=()->{
            for(int i=0; i<1000; i++){
                c.incrementCount();
            }
        };

        Runnable obj2=()->{
            for(int i=0; i<1000; i++){
                c.incrementCount();
            }
        };
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        System.out.println(c.count);
    }
}