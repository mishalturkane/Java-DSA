package dsa.stack.stackexample5;

import java.util.EmptyStackException;
import java.util.Scanner;

public class UseExample {
    public static void main(String[] args) {
        Example s=new Example();
        Scanner kb=new Scanner(System.in);

        int n;
        do {
            System.out.println("Select the operation:");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
            n=kb.nextInt();
            switch (n){
                case 1:

                        System.out.println("Enter the element");
                        int a=kb.nextInt();
                        s.push(a);
                        System.out.println("Pushed element is:"+a);
                        break;
                case 2:
                    try{
                        int b=s.pop();
                        System.out.println("Popped element is:"+b);
                    }catch (EmptyStackException ex){
                        System.out.println("CQueue khali h");
                    }
                    break;
                case 3:
                    try{
                        int c=s.peek();
                        System.out.println("Topped element is:"+c);
                    }catch (EmptyStackException ex){
                        System.out.println("CQueue khali hain");
                    }
                    break;
                case 4:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Please select the correct options");
            }
        }while (n!=4);
    }
}
