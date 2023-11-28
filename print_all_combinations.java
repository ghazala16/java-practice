public class print_all_combinations {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int r=3;
        int n=arr.length;
        print_all_combinations(arr,n,r);
    }

    private static void print_all_combinations(int[] arr, int n, int r) {
        int data[]=new int[r];
        combination(arr,data,0,n-1,0,r);
    }

    private static void combination(int[] arr, int[] data, int start, int end, int index, int r) {
         // Current combination is ready to be printed, print it
         if (index == r)
         {
             for (int j=0; j<r; j++)
                 System.out.print(data[j]+" ");
             System.out.println("");
             return;
         }
         // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combination(arr, data, i+1, end, index+1, r);
        }
    }
}
