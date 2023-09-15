public class character_pattern {



   /*  public static void main(String[] args) {
        String[] array={"A","B","C","D","E","AA","AB","AC","AD","AE","BA"};
        for(int i=0;i<array.length;i++)

        {
            System.out.println(i+1+"."+array[i]);
        }
    }*/



//.....................PAIR IN ARRAY..................................................................................................
    public static void main(String args[])
    {
        String n[] ={"A","B","C","D","E"};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                    String curr=n[i];
                    System.out.print(""+curr+","+n[j]+" ");
                
        }
        System.out.println();
    }
}
}
