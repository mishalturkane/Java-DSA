package dsa.queue.queueexample2;



import java.util.Scanner;


public class UseQueue {
    public static void main(String[] args) {
        CQueue qu=new CQueue(3);
        Scanner kb=new Scanner(System.in);

        int n;
        do {
            System.out.println("Select the operation:");
            System.out.println("1.insert\n2.remove\n3.peek\n4.Quit");
            n=kb.nextInt();
            switch (n){
                case 1:
                   try{
                       System.out.println("Enter the element");
                       int a=kb.nextInt();
                       qu.insert(a);
                       System.out.println("inserted element is:"+a);
                   }catch (QueueException ex){
                       System.out.println( ex.getMessage());
                   }
                    break;
                case 2:
                   try{
                       int b=qu.remove();
                       System.out.println("removed element is:"+b);
                   }catch (QueueException ex){
                       System.out.println( ex.getMessage());
                   }
                    break;
                case 3:
                    try{
                        int c=qu.peek();
                        System.out.println("front element is:"+c);
                    }catch (QueueException ex){
                        System.out.println( ex.getMessage());
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
