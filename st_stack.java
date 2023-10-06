import java.util.ArrayList;
public class st_stack {
    public static void main(String[] args)
    {
        stack_operations s=new stack_operations();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    static class stack_operations
    {
        static ArrayList<Integer> list=new ArrayList<>();
    
    public static boolean isEmpty()
    {
        return list.size()==0;
    }
    
    //push
    public static void push(int data)
    {
        list.add(data);
    }
    //pop
    public static int pop()
    {
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);//When removing an element from the ArrayList, you should pass the index of the element to be removed, not the element itself. (i.e., not top ) remove list.size()-1
        return top;
    }
    //peek
    public static int peek()
    {
        return list.get(list.size()-1);
    }
    }
}
