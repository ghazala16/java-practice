public class team_selection {
    public static int nines(int n, int[] a, int k) {
        // Write your code here.
       int flag=0;
       int ans[];
       int curr=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==9)
            {
            curr++;
            }
        }
        return (curr>=k)?1:0;///The curr variable retains its value after the loop because it is declared within the same method. It keeps track of the count of players with skill level 9 throughout the loop iterations. The value of curr is then used in the comparison and returned as the final result of the nines function.
    }
}
