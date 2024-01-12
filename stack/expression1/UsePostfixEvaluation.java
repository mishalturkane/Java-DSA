package dsa.stack.expression1;

import java.util.Scanner;

public class UsePostfixEvaluation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid  Postfix exp(Numbers):");
        String str=kb.next();
        float res;
        PostfixEvaluation px=new PostfixEvaluation(str);
        res=px.evaluate();
        System.out.println("Result is:"+res);
    }
}
