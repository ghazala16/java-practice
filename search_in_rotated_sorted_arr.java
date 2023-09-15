public class search_in_rotated_sorted_arr {
    public static void print_arr(int arr[]){
       
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]+" ");
        }
    }


    public static int search_in_rotated_sorted_arr(int arr[],int si,int ei,int target)
    {
        int mid=(si+ei)/2;
        if(si>ei)
        return -1;

        // case best case when target is mid
        if(arr[mid]== target)
        return mid;
//mid on line 1
         if(arr[si]<arr[mid])
            {
                //case a: left
                if(arr[si]<= target && target<=arr[mid] )
                return search_in_rotated_sorted_arr(arr,si,mid-1,target);
                else // case b: right
                return search_in_rotated_sorted_arr (arr , mid + 1, ei, target );
                
            }
    
    //mid on line 2
    else{
        //case c:right
        if(arr[mid]<=target && target<= arr[ei])
            return search_in_rotated_sorted_arr(arr , mid + 1, ei, target);
        else 
        //case d:left
        return search_in_rotated_sorted_arr(arr , mid - 1, ei, target);

    }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search_in_rotated_sorted_arr(arr, 0, arr.length-1,target));
    }
}
