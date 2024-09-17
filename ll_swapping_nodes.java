public class ll_swapping_nodes {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static   Node head;
    public static   Node prev;
    public static   Node next;
    public static   Node tail;
    public static int size;
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //print ll...........................................
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
        System.out.println(temp.data+"");
        temp=temp.next;
        }
    System.out.println("null");
if(head==null)
{
    System.out.println("ll is empty");
    return;
}
}
public void ll_swapping_nodes()
{
    //find mid
    Node slow=head;
    Node fast=head.next;
    while (fast != null && fast.next != null){
        //swap the nodes.........................
        slow=slow.next;
        fast=fast.next.next;
}
Node mid=slow;
//reverse 2nd half
Node curr=mid.next;
mid.next=null;
Node prev=null;
Node next;
while (curr!= null ){

    next = curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
Node left=head;
Node right=prev;

}


public static void main(String[] args) {
    ll ll= new ll();
    ll.print();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.print();
    ll.addLast(10);
    ll.addLast(11);
}
}
