import java.util.Arrays;

public class jersey_quest {
    static void minDifference(int []a) {
        int min=Integer.MAX_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            Arrays.sort(a);
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(a[i]-a[j])<min )
                min=Math.abs(a[i]-a[j]);
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int n=5;
        int a[]={1,5,11,2,7};
        minDifference(a);
    }
}


/*
import java.util.*;

public class Solution {
    static int minDifference(int []a) {
        int min=Integer.MAX_VALUE;
        int n=a.length-1;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
                if(Math.abs(a[i+1]-a[i])<min )
                min=Math.abs(a[i+1]-a[i]);
        }
        return min;
    }
} */
