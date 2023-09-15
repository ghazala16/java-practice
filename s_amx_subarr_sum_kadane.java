import java.util.Scanner;
public class s_amx_subarr_sum_kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numbers[]={-2,-3,-4,-5,-6,2,3,4,5,6};
        kadane(numbers);
    }
    public static void kadane(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++)
        {
            cs+=numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    
}



/*----------------MIN SUM----------------------
public static void kadane(int numbers[]) {
        int ms=Integer.MAX_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++)
        {
            cs+=numbers[i];
            if(cs>0){
                cs=0;
            }
            ms=Math.min(cs,ms);
        }
        System.out.println(ms);
    } */
