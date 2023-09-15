public class permutation
{
    public static void findPermutation(String str,String ans)
    {
        //// If the input string is empty, we have found a permutation.
        // Print it and return.
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++)
        {
        char curr = str.charAt(i);
        //abcde=>"ab"+"de"="abde"
        String NewStr=str.substring(0, i)+str.substring(i+1);

        //str.substring(0, i) extracts a substring from the beginning of 
        //the str up to (but not including) the character at index i. 
        //This effectively captures all characters in str before the 
        //character at index i.

//str.substring(i + 1) extracts a substring starting 
//from the character immediately after the one at index i
// until the end of the string str. This effectively captures all 
//characters in str after the character at index i.
        findPermutation(NewStr,ans+curr);
    }
}
public static void main(String[] args) {
    String str="abc";
    findPermutation(str,"");
}
    }

