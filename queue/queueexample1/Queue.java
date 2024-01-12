package dsa.queue.queueexample1;

//Linear Queue
public class Queue {
   private int [] arr;
    private int front,rear;
    private   int size;
    public Queue(int size){
        arr=new int[size];
        rear=-1;
        front=0;
        this.size=size;
    }
    public void insert(int x){
        if(rear==size-1)
            throw new QueueException("CQueue Overflow");
        rear=rear+1;
        arr[rear]=x;
    }
    public  int remove(){
        if(front>rear)
            throw  new QueueException("CQueue Underflow");
       //  QueueException obj=new QueueException("Example Underflow");
       //  throw obj;

        int x=arr[front];
        front++;
        return x;
    }
    public  int peek(){
        if(front>rear)
            throw  new QueueException("CQueue Underflow");
        int x=arr[front];
        return x;
    }

}
