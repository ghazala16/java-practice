import java.util.LinkedList;

import org.w3c.dom.Node;
public class ll_remove_last {
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

public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.removeLast();
}
}

