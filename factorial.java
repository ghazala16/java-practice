import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
       int factorial=n*fact(n-1);
        System.out.println(factorial);
    }
    public static int fact(int n) {
    if (n == 1)
    return 1;
    else 
    {
      return n*fact(n-1);
    } 
    
  }

}