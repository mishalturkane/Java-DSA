package dsa.queue.queueexample3;

import java.util.ArrayList;


//Arraylist implementation Queue

public class CQueue {
   private ArrayList<Integer> arr;
    private int front,rear;

    public CQueue(int size){
        arr=new ArrayList<>();
        rear=-1;
        front=-1;
    }
    public void insert(int x){

        arr.add(rear,x);
        if(front==-1)   /** first inserting me ham front ko 0 kr rhe h kyu ki woh 0 point karenga */
            front=0;
    }
    public  int remove(){
        if(front==-1)
            throw  new QueueException("CQueue Underflow");

       int x=arr.remove(front);

        if(front==rear)
            front=rear=-1;
        else
             front++;
        return x;
    }
    public  int peek(){
        if(front==-1)
            throw  new QueueException("CQueue Underflow");

        return arr.get(front);
    }

}
