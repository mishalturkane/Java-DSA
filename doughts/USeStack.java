package dsa.doughts;

public class USeStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        int x=10;
        for(int i=1;i<=5;i++){
            s.push(x);
            System.out.println("Pushed element:"+x);
            x+=10;
        }
        System.out.println("Topped element is:"+s.peek());
        for(int i=1;i<=5;i++){
            int xx=s.pop();
            System.out.println("Popped element:"+xx);
        }

    }
}
