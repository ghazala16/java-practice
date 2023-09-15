/*
import java.util.Scanner;
public class digit_to_alphabet {
    public static int digit_to_alphabet(String alphabet,int i,boolean map[],int num)
    {
        if(i==alphabet.length())
            return 0;

        char currChar=alphabet.charAt(i);
        if(map[currChar-'a']==true)
        digit_to_alphabet(alphabet, i+1,map,num);
        else
            map[currChar-'a']=true;
            return digit_to_alphabet(alphabet, i+1,map,num);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] alphabet={"one","two","three","four","five","six","seven","eight","nine"};
        
        Integer num=s.nextInt();
        num.toString();
        
        digit_to_alphabet(alphabet.toString(),0,new boolean[26],num);
    }
}

*/

public class digit_to_alphabet {
    
}
