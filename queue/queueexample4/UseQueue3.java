package dsa.queue.queueexample4;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class UseQueue3 {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> q=new LinkedBlockingQueue<>(3);
        System.out.println("Size of the bounded queue is:"+q.size());
        q.add(10);
        System.out.println("After adding 10:"+q);
        q.add(20);
        System.out.println("After adding 20:"+q);
        q.add(30);
        System.out.println("After adding 30:"+q);


        Queue<Integer>  q2=new LinkedBlockingQueue<>();
        System.out.println("After new size"+q.remainingCapacity());
    }
}
