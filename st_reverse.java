import java.util.Stack;

public class st_reverse {
    public static void main(String args[])
    {
        String str="abc";
        String result=reverseString(str);
        System.out.println(result);
    }
    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        //to reverse string
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
        char curr=s.pop();
        result.append(curr);
        }
        return result.toString();
    }
}
