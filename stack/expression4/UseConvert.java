package dsa.stack.expression4;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a infix expression for converting to prefix exp:");
        String str=kb.next();
        Convert convert=new Convert(str);
        convert.toPostfix();
        System.out.println(convert);
    }
}
