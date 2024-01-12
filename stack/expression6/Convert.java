package dsa.stack.expression6;

import java.util.Stack;

public class Convert {
    private  String prefix;
    private String infix;

    public Convert(String infix) {
        this.infix = infix;
        prefix ="";
    }
    public void toPrefix(){
        Stack<Character> st=new Stack<>();
        for(int i=infix.length()-1;i>=0;i--){
            char ch=infix.charAt(i);
            if(ch==')')
                st.push(')');
            else if(ch=='(') {
                while (st.peek() != ')') {
                    prefix += st.pop();
                }
                st.pop();
            }
            else if(isOperand(ch)){
                prefix +=ch;
            }else {
                 while(st.empty()==false){
                     if(st.peek()==')'){
                         break;
                     }
                     if(precedence(ch)>precedence(st.peek())){
                                    break;
                     }
                        prefix = prefix +st.pop();
                 }
                 st.push(ch);
            }
        }
        while(st.empty()==false){
            prefix +=st.pop();
        }
        StringBuffer sb=new StringBuffer(prefix);
        prefix=sb.reverse().toString();
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
        return "Infix:"+infix+"\nPrefix:"+ prefix;

    }

}
