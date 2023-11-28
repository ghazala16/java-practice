import java.util.Queue;
import java.util.Stack;
public class q_jcf
{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n)
        {
            arr = new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
    public static boolean isEmpty()
    {
        return s1.isEmpty();
    }
    //add
    public static void add(int data)
    {
        while(s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    //remove
    public static int remove()
    {
        if(isEmpty())
        {
            System.out.println();
        }
    int result = arr[front];
    //last element deleted
    if(rear==front)
    {
        rear=front=-1;
    }
    else
    {
        front =(front+1)%size;
    }
    return result;
    }

    //peek
    public static int peek()
    {
        if(isEmpty())
        {
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args)
    {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    }
}
