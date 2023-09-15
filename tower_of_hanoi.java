import java.util.Scanner;

public class tower_of_hanoi
{
    public static int tower_of_hanoi(int n,char s,char a,char d)
    {
        
        if(n==1){
            System.out.println(s +"->"+d);
        return 0 ;
     }
        
        tower_of_hanoi(n-1, s, d, a);
        tower_of_hanoi(1, s, a, d);
        tower_of_hanoi(n-1, a, s, d);
        int x= (int) (Math.pow(2, n)-1);
        return x;
    }
        
        

    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in );
        int n=sc.nextInt();
        System.out.println();
        System.out.println("the total moves are"+" "+tower_of_hanoi(n, 's', 'a', 'd'));
        
    }
}