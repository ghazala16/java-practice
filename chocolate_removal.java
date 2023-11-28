public class chocolate_removal {
    static void totalChocolates(int n, int []a) {
        // Write your code here.
        
        long curr=0;
        long totalEatenChocolates = 0;
        for(int i=0;i<n ;i++)
        {
           /* while(a[i]>23 ){
            a[i]--;
            curr++;
            }
        
        }return curr;
        */

        int chocolatesToReduce = Math.max(0, a[i] - 23);
            totalEatenChocolates += chocolatesToReduce;
        }

        System.out.println(totalEatenChocolates) ;
    }
    public static void main(String[] args) {
        int a[]={24,25,28,29};
        int n=a.length;
        totalChocolates(4, a);
    }
}
