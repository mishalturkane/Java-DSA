package dsa.linkedlist.example1;

public class UseNode {
    public static void main(String[] args) {
        Node first=new Node();
        first.data=10;
        Node second=new Node();
        second.data=20;
        first.next=second;
        Node third=new Node();
        third.data=30;
        second.next=third;
        Node temp=first.next;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
