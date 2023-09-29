public class ll_zigzag {
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
    public static   Node tail;
    public static int size;

    public void zigzag()
    {
        //find mid............
        Node slow= head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        Node mid =slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        Node nextL;
        Node nextR;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        // alternate merge --zigzag
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
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
    public static void main(String[] args) {
        ll_zigzag ll=new ll_zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}

