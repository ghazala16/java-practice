import java.util.Arrays;

public class dp_min_arr_jumps {
    public static void main(String[] args) {
    int arr[]={2,3,1,1,4};
    System.out.println(dp_min_arr_jumps(arr));
    }
    public static int dp_min_arr_jumps(int arr[])
    {
        
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            int steps=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++)
            {
                if(dp[j]!=-1)
                ans=Math.min(ans,dp[j]+1);
            }
        
        if(ans!=Integer.MAX_VALUE)
        {
            dp[i]=ans;
        }
        }
        //dp[0]--->0 to n-1
        return dp[0];
    }
}
