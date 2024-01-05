package dsa.stackexample5;


import java.util.Stack;

public class Example {
    private Stack<Integer> arr;

    public Example(){
        arr=new Stack<>();
    }
    public void push(int item){
        arr.push(item);
    }
    public int  pop(){
        return arr.pop();
    }
    public int peek()  {
       return arr.peek();
    }
}
