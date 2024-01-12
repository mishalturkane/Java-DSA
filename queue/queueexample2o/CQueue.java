package dsa.queue.queueexample2o;

public class CQueue {
   private int [] arr;
    private int front,rear;
    private   int size;
    public CQueue(int size){
        arr=new int[size];
        rear=-1;
        front=-1;
        this.size=size;
    }
    public void insert(int x){
        if((rear+1)%size==front)
            throw new QueueException("Queue Overflow");

        rear=(rear+1)%size;

        arr[rear]=x;
        if(front==-1)   /** first inserting me ham front ko 0 kr rhe h kyu ki woh 0 point karenga */
            front=0;
    }
    public  int remove(){
        if(front==-1)
            throw  new QueueException("CQueue Underflow");

        int x=arr[front];

        if(front==rear)
            front=rear=-1;
        else if(front==size-1)
             front=0;
        else
             front++;
        return x;
    }
    public  int peek(){
        if(front==-1)
            throw  new QueueException("CQueue Underflow");
        return arr[front];
    }

}
