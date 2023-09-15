public class subsets {
    public static void find_subset(String str, String ans,int i)
    {
        // base class
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        find_subset(str, ans+str.charAt(i), i+1);
        //no choice
        find_subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        int i=0;
        find_subset(str, "", i);
    }
}
