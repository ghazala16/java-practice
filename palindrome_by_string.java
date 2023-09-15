public class palindrome_by_string
{
    public static void main(String args[])
    {
        
        String str=new String("raecar");//String str="racecar"; // You can directly initialize the string like this
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                System.out.println("not a palindrome");
                return;
            }
           //return ;// Exit the function if not a palindrome
        }
        System.out.println("palindrome");
    }
}