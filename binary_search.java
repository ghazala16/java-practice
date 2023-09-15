import java.util.Scanner;

public class binary_search {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        
        int key=s.nextInt();
        int flag=0;
        int a[]=new int[5];
        int mid=a.length/2;
        for(int i=0 ; i<=a.length-1 ;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0 ; i<=mid ;i++)
        {
            
            if(a[i]==key)
            {
                flag=0;
                System.out.println("found");
                break;
            }
            else{
                
                for(mid=mid+1;mid<a.length;mid++)

                {
                    if(a[i]==key)
            {
                flag=0;
                System.out.println("found");
                break;
            }
                }
                flag=1;
                System.out.println("not found");
                break;
                }
        }
    }
}

