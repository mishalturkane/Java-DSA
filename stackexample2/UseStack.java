package dsa.stackexample2;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        int x=10;
        for(int i=1;i<=6;i++){
            s.push(x);
            System.out.println("Pushed:"+x);
            x=x+10;
        }
        System.out.println("Top element is:"+s.peek());
        for(int i=1;i<=6;i++){
             x=s.pop();
            System.out.println("Popped:"+x);
        }

    }
}
