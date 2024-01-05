package dsa.doughts;

public class Stack {
    private int [] arr;
    private int tos;
    private int size;
    public Stack(int size){
        arr=new int [size];
        tos=-1;
       this.size=size;
    }
    public void push(int x){
        if(tos==size-1){
            System.out.println("Example overflow exceptions");
            return ;
        }
        ++tos;
        arr[tos]=x;

    }
    public int pop(){
        if(tos==-1){
            System.out.println("Example Underflow exceptions");
            return -1;
        }
        int x=arr[tos];
        --tos;
        return x;
    }
    public int peek(){
        if(tos==-1){
            System.out.println("Example Underflow exceptions");
            return -1;
        }
        return arr[tos];
    }
}
