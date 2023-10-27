import java.util.Stack;

public class next_greater_element {
    public static void main(String args[])
    {
        int arr[]={6,8,0,1,3};
        Stack <Integer>s =new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            if(!s.isEmpty())
            {
                nextGreater[i]=arr[s.peek()];
            }
            else
            {
                nextGreater[i]=-1;
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++)
        {
            System.out.println(nextGreater[i]+"");
        }
        System.out.println();
    }
}
