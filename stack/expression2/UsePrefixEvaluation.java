package dsa.stack.expression2;

import java.util.Scanner;

public class UsePrefixEvaluation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid  Prefix exp(Numbers):");
        String str=kb.next();
        float res;
        PrefixEvaluation px=new PrefixEvaluation(str);
        res=px.evaluate();
        System.out.println("Result is:"+res);
    }
}
