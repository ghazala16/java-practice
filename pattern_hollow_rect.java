// ....................................wrong code..............................................
import java.util.Scanner;
public class pattern_hollow_rect {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
    int totcols=s.nextInt();
    int totrows=s.nextInt();
    for(int i=1;i<=totrows;i++)
    {
        for(int j=1;j<=totcols;j++)
        {
            if(i==1|| i==totrows||j==1||j==totcols)
            {
                System.out.println("*");
            }
            System.out.print(" ");
        }
    } 
   System.out.println();
}
}
