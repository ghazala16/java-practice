import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Linked {
    public static void main(String[] args) {
        //acc to alphabetical order
         HashSet<String> hs =new HashSet();
        hs.add("D");
        hs.add("M");
        hs.add("N");
        hs.add("B");
        System.out.println(hs);


        //acc to iteration
        LinkedHashSet<String> lhs =new LinkedHashSet();
        lhs.add("D");
        lhs.add("M");
        lhs.add("N");
        lhs.add("B");
        System.out.println(lhs);

    }
}
