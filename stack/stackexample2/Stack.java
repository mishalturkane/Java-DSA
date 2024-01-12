package dsa.stack.stackexample2;

public class Stack {
   private int [] arr;
    private int tos;
    private   int size;
    public Stack(int size){
        arr=new int[size];
        tos=-1;
        this.size=size;
    }
    public void push(int x){
        if(tos==size-1)
            throw new StackException("stack Overflow");
        tos=tos+1;
        //++tos
        arr[tos]=x;
    }
    public  int pop(){
        if(tos==-1)
            throw  new StackException("stack Underflow");
       //  QueueException obj=new QueueException("Example Underflow");
       //  throw obj;

        int x=arr[tos];
        tos--;
        return x;
    }
    public  int peek(){
        if(tos==-1)
            throw  new StackException("CQueue Underflow");
        int x=arr[tos];
        return x;
    }

}
