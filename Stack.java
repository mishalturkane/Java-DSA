package doughts;

public class Stack {
    private int tos;
    private int [] arr;
    private int size;

    public Stack(int size){
        tos=-1;
        this.size=size;
        arr=new int[size];
    }
    public void push(int x){
        if(tos==size-1){
            System.out.println("Stack Full Ho gya hai");
        }
        tos++;
        arr[tos]=x;
        System.out.println("Element pushed:"+x);
    }

    public int pop(){
        if(tos==-1){
            System.out.println("Stack is underflow");
        }
        int x=arr[tos];
        tos--;
        System.out.println("Element is poped"+x);
        return x;

    }
    public int peek(){
        if(tos==-1){
            System.out.println("Stack is underflow");
        }
        System.out.println("Top element is:"+ arr[tos]);
       return arr[tos];
    }
}
