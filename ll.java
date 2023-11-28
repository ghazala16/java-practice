public class ll {
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

    ///add first in ll....................
    public void addFirst(int data)
    {
        //s1-> create new node
        Node newNode=new Node(data);
        //s2->  newnode.next =head
        newNode.next=head;
        //s3-> head=> newNode=> we will make new node as head now
        head=newNode;
        //if no node is present then 
        //s1=create newNode
        //Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
    }


    //add last in ll........................
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

///add in middle.............................
public void add(int idx,int data)
{
    if(idx==0)
    {
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);
    Node temp = head;
    int i=0;
    while(i<idx-1)
    {
        temp=temp.next;
        i++;
    }
    //i=idx-1;temp->prev
    newNode.next=temp.next;
    temp.next=newNode;
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

