//we can rotate rotate 
//pivot =last ele
public class quick_sort {
      public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       // System.out.println();
   }
    public static void quick_sort(int arr[], int si,int ei)
    {
        if(si>=ei)
        return;

        int partition_index =partition(arr,si,ei);
        quick_sort(arr, si, partition_index-1);
        quick_sort(arr, partition_index+1, ei);
    }
    public static int partition(int arr[], int si, int ei)
    {
        int pivot=arr[ei];
        int i=si-1; /// to make place for ele smaller than pivot why not -1?
            for(int j=si;j<ei;j++) //j!=0 as j can be started from anywhere
            {
                if(arr[j]<=pivot)//arr[j] is the current element for comparision with pivot
                {
                    i++;// so i jagah banaayega
                //swap
                    int temp=arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }
            }
            /// to make correct place for pivot
                i++;
                 int temp=pivot;
                arr[ei]= arr[i];//don't write  pivot=arr[i] as it will change the pivot value
                arr[i]=temp;
                return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quick_sort(arr, 0,arr.length-1);
        printArr(arr);
    }
}