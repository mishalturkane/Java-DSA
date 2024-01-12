package dsa.queue.queueexample4;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue2 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner kb=new Scanner(System.in);
        int n;
        Integer x;
        do {
            System.out.println("Select the operation:");
            System.out.println("1.insert\n2.remove\n3.peek\n4.Quit");
            n = kb.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the element");
                    int a = kb.nextInt();
                    q.offer(a);
                    System.out.println("element added:" + a);
                    break;
                case 2:

                         x=q.poll();
                         if(x!=null)
                        System.out.println("Element removed:"+x);
                        else
                             System.out.println("Queue underflow");
                    break;
                case 3:
                    x=q.peek();
                    if(x!=null)
                        System.out.println("top  element:"+x);
                    else
                        System.out.println("Queue underflow");
                    break;
                case 4:
                    System.out.println("Thank u");
                    break;
                default:
                    System.out.println("Pick write choice");
            }
        }while(n!=4);
    }
}
