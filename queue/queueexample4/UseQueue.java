package dsa.queue.queueexample4;

import dsa.queue.queueexample3.QueueException;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner kb=new Scanner(System.in);
        int n;
        do {
            System.out.println("Select the operation:");
            System.out.println("1.insert\n2.remove\n3.peek\n4.Quit");
            n = kb.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the element");
                    int a = kb.nextInt();
                    q.add(a);
                    System.out.println("element added:" + a);
                    break;
                case 2:
                    try{
                        int x=q.remove();
                        System.out.println("Element removed:"+x);
                    }catch (NoSuchElementException ex){
                        System.out.println("Queue Underflow");
                    }
                    break;
                case 3:
                    try{
                        int x=q.element();
                        System.out.println("top element:"+x);
                    }catch (NoSuchElementException ex){
                        System.out.println("Queue underflow");
                    }
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
