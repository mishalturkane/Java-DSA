package dsa.stackexample4;

import java.util.ArrayList;

public class Stack {
   private ArrayList<Integer> arr;
    private int tos;

    public Stack(int size){
        arr=new ArrayList<>(size);
        tos=-1;

    }
    public void push(int x){
        tos=tos+1;
       arr.add(tos,x);
    }
    public  int pop(){
        if(tos==-1)
            throw  new StackException("Example Underflow");
       //  StackException obj=new StackException("Example Underflow");
       //  throw obj;

        int x=arr.remove(tos);
        tos--;
        return x;
    }
    public  int peek(){
        if(tos==-1)
            throw  new StackException("Example Underflow");
        int x=arr.get(tos);
        return x;
    }

}
