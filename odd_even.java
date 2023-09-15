import java.util.Scanner;

// Driver Class
public class odd_even {
	// main function
	public static void main(String[] args)
	{ 
	    int sum=0,sum1=0;
	    Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		     sum+=i;
		    else 
		     sum1+=i;
		}
		System.out.println("even sum"+sum);
		System.out.println("odd sum"+sum1);
	}
}