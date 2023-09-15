public class s_subarr {
    public static void main(String args[])
    {
        int n[] ={2,3,4,5};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(n[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


