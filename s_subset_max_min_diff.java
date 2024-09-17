//chocolate distribution
import java.util.Arrays;
public class s_subset_max_min_diff {
    
    static int min=Integer.MAX_VALUE;
    //static int max=Integer.MIN_VALUE;
    int curr=0;
    public  static int chocolate_distributin_diff(int arr[],int m)
    {int diff=0;
        Arrays.sort(arr);
        for(int i=0;i+m-1<arr.length;i++)//arr[i + m - 1] represents the last element of the current window.
        {
            diff=arr[i+m-1]-arr[i];
            if (diff < min)
            {
            min= diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m=3;
    System.out.println(chocolate_distributin_diff(arr, m));
    }
}
