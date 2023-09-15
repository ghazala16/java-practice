public class heap_sort_max
{
    public static void heap_find_kth_largest_element(int arr[])
    {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }
    }
        static void printarray(int arr[])
        {
            int n=arr.length;
            for(int i=0;i<n;++i)
            {
                System.out.println(arr[i]);
            }
        }
    
    public static void heapify(int arr[],int i,int size)
    {
        
        int left=2*i+1;
        int right=2*i+2;
        int maxIndex=i;
        if(left<size && arr[left]>arr[maxIndex])
        maxIndex=left;
        if(right<size && arr[right]>arr[maxIndex])
        maxIndex=right;
        if(maxIndex!=i)
        {
            int swap=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=swap;
            heapify(arr,size,maxIndex);
        }
    }
    
    public static void main(String args[])
    {
        //PriorityQueue<Heap> h=new PriorityQueue<>(0, null)
        int arr[]={12,11,13,5,6,7};
        int n=arr.length;
        heap_sort_max h=new heap_sort_max();
        h.heap_find_kth_largest_element(arr);
        printarray(arr);
        
    }

}