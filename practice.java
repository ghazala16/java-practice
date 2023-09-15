/*public class practice {
    public static void main(String args[]){
    int a=10;
    
    System.out.println(a--*a--);
}
}
*/

/* ---------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Scanner;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        for(int i=1;i<=n;i++)
        for(int j=i+1;j<=n;j++)
        for(int k=i;k<=j;k++)
        {
            System.out.println(arr[k]);
        }
        return null;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s= sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        subarraySum(arr,n,s);
    }
   /* public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt;
        int s= sc.nextInt;
        int arr[]=new Int[n];
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt;
        }
        subarraySum(arr,n,s);
    }*/







import java.util.ArrayList;

public class practice {

    public static ArrayList<Integer> findSubarraySum(int[] A, int N, int S) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0;
        int currentSum = 0;

        while (right < N) {
            currentSum += A[right];

            while (currentSum > S) {
                currentSum -= A[left];
                left++;
            }

            if (currentSum == S) {
                result.add(left + 1); // 1-based indexing
                result.add(right + 1);
                return result;
            }

            right++;
        }

        result.add(-1); // No subarray found
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int N = A.length;
        int S = 15;

        ArrayList<Integer> result = findSubarraySum(A, N, S);
        System.out.println(result);
    }
}
