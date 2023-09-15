public class paidr_in_arr {
    public static void main(String args[])
    {
        int n[] ={2,3,4,5};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                    int curr=n[i];
                    System.out.print(""+curr+","+n[j]+" ");
                
        }
        System.out.println();
    }
}
}
