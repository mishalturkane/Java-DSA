package dsa.stack.expression3;

import java.util.Stack;

public class Convert {
    private  String postfix;
    private String infix;

    public Convert(String infix) {
        this.infix = infix;
        postfix="";
    }
    public void toPostfix(){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(isOperand(ch)){
                postfix=postfix+ch;
            }else {
                 while(st.empty()==false){
                     if(precedence(ch)>precedence(st.peek())){
                                    break;
                     }
                        postfix=postfix+st.pop();
                 }
                 st.push(ch);
            }
        }
        while(st.empty()==false){
            postfix+=st.pop();
        }
    }
    public int precedence(char ch){
        if(ch=='$')
            return 3;
        else if(ch=='/' || ch=='*' || ch=='%')
            return 2;
        else if(ch=='+' || ch=='-')
            return 1;
        else
            return 0;
    }
    public boolean isOperand(char ch){
        return  (ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57);

    }
    public String toString(){
        return "Infix:"+infix+"\nPostfix:"+postfix;
    }
}
