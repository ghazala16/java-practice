public class rain_water_trap {
    public static void main(String args[])
    {
        int height[]={2,4,6,3,7,9};
        trapped_water(height);
        
        
    }
    public static void trapped_water(int height[])
    {
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<=n-1;i++) /// as for i=0 we have initialised leftmax as: leftmax[0]=height[0];
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);//height=curr height
        }
         int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i-1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(leftmax[i],rightmax[i]);//  we calculated min because above the min bar only the water will be trapped
            trappedwater=waterlevel-height[i];//so trapped water will be the water level-building height
            System.out.println(trappedwater);
        }
        System.out.println(trappedwater);
    }
    
}
