import java.util.Scanner;
public class sum_of_int_val {
    /*public static void diff(int num)
    {
        
        
    }
    */


     
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
       int i=0;
        for(i=0;num>0;)
        {
        i+=num%10;
        
        num=num/10;
        
    }
System.out.println(i);
    }
    
}

