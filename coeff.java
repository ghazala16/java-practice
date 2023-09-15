import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int r;
        Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
	    r= s.nextInt();
       int coeff=fact(n)/(fact(r)*fact(n-r));
        System.out.println(coeff);
    }
    public static int fact(int n) {
    if (n == 0)
    return 1;
    else 
    {
      return n*fact(n-1);
    } 
    
  }

}