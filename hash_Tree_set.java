import java.util.HashSet;
import java.util.TreeSet;

public class hash_Tree_set
{
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("D");
        ts.add("M");
        ts.add("N");
        ts.add("B");
        System.out.println(ts);

        ///count distinct elements---in hash set no duplicate elements
        int nums[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        System.out.println("ans="+set.size());


        ////union and inetrsection of set
        int arr1[]={7,3,9};
        int arr2[]={7,3,9,6,2,4};
        int count=0;
        HashSet<Integer>set1=new HashSet<>();
        
        for(int i=0;i<arr2.length;i++)
        {

            if(set1.contains(arr2))
                count++;
                set1.remove(arr2);
                System.out.println(set1);
        }
    }
}