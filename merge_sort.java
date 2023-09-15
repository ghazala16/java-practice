public class merge_sort {
      public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       // System.out.println();
   }
    public static void merge_sort(int arr[], int si,int ei)
    {
        if(si>=ei)
        return;

        int mid =si+(ei-si)/2;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        //lef(0,3)=4  right(4,6)=3 -> 6-0+1 ///we have added +1 to make it as 1 indexing not zero as arr size is 1 more than indexing
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while((i<=mid &&j <=ei))
        {
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];//if i is small it will go to the k arr
            else
                temp[k++]=arr[j++];
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=ei)
            temp[k++]=arr[j++];
        for(k=0,i=si;k<temp.length;k++,i++)
            arr[i]=temp[k];
        //for( i=0;i<arr.length;i++)
           // System.out.print(arr[i]+" ");
        //System.out.println();

    }
    
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        merge_sort(arr, 0,arr.length-1);
        printArr(arr);


    }
    
}
