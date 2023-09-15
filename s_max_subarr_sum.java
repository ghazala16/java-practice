public class s_max_subarr_sum {
    public static void maxsubarr(int n[])
    {
        int ms=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                currSum=0;
                for(int k=i;k<=j;k++)
                {
                    currSum+=n[k];
                }
                    if(ms<currSum)
                    {
                        ms=currSum;
                        
                    }
        }
    }
    System.out.println(ms);
}
public static void main(String args[])
{
    int n[] ={2,3,4,5};
    maxsubarr(n);
    
}
}

