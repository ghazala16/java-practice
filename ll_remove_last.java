public class ll_remove_last {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public int ll_remove_last(int size)
    {
        
    if(size==0)
    {
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1)
    {
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }

//previous:i=size-2
Node prev=head;
for(int i=0;i<size-2;i++)
{
prev=prev.next;
}
int val=prev.next.data;
prev.next=null;
tail=prev;
size--;
return val;
}
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
    ll_remove_last ll=new ll_remove_last();
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.print();

    ll.ll_remove_last(3);
    ll.print();
    //System.out.println(ll.size);
}
}

