/*public class string_substring {
    public static String substring(String str,int si,int ei)
    {
        String substr=" ";
        for(int i=si;i<ei;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println("Substring is "+substring(str,2,6));
    }
}
*/

/* inbuilt function is .substring(si,ei) */

public class string_substring {
    public static String substring(String str,int si,int ei)
    {
        String substr=" ";
        for(int i=si;i<ei;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println("Substring is "+str.substring(2,6));
    }
}