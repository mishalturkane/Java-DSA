package dsa.queue.queueexample2;
//Circular Queue
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
        if(rear==size-1 && front==0 || rear+1==front){
             throw new QueueException("CQueue Overflow");
        }
        if(rear==size-1){  /** kabhi element delete kr ke fir se insert kiya ja rha h , kyu ki rear to first size ke last index pe honga*/
            rear=0;           /** to fir se use  niche wale index me dal diyaja rha h*/
        }else
            rear++;     /** yaha index first time insert ho rha h*/
        arr[rear]=x;
        if(front==-1)   /** first inserting me ham front ko 0 kr rhe h kyu ki woh 0 point karenga */
            front=0;
    }
    public  int remove(){
        if(front==-1)
            throw  new QueueException("CQueue Underflow");
       //  QueueException obj=new QueueException("Example Underflow");
       //  throw obj;

        int x=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else if(front==size-1){
             front=0;
        }
        else
             front++;
        return x;
    }
    public  int peek(){
        if(front==-1)
            throw  new QueueException("CQueue Underflow");
        int x=arr[front];
        return x;
    }

}
