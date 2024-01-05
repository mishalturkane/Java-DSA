package dsa.stackexample4;

import java.util.Scanner;


public class UseStack {
    public static void main(String[] args) {
         Stack s=new Stack(5);
        Scanner kb=new Scanner(System.in);

        int n;
        do {
            System.out.println("Select the operation:");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
            n=kb.nextInt();
            switch (n){
                case 1:
                   try{
                       System.out.println("Enter the element");
                       int a=kb.nextInt();
                       s.push(a);
                       System.out.println("Pushed element is:"+a);
                   }catch (StackException ex){
                      ex.getMessage();
                   }
                    break;
                case 2:
                   try{
                       int b=s.pop();
                       System.out.println("Popped element is:"+b);
                   }catch (StackException ex){
                       ex.getMessage();
                   }
                    break;
                case 3:
                    try{
                        int c=s.peek();
                        System.out.println("Topped element is:"+c);
                    }catch (StackException ex){
                        ex.getMessage();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please select the correct options");
            }
        }while (n!=4);
    }
}
