import java.util.Scanner;
public  class prime{
 public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
int n=s.nextInt();

for(int i=2;i<n ;i++)
if(n%i!=0)
System.out.println("prime");
else
System.out.println("not prime");
    }
}
