import java.util.HashSet;
import java.util.Iterator;
public class HashMap_HashSet {
    public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    System.out.println(set);
    if(set.contains(2))
    System.out.println("set contains=2");
    if(set.contains(3))
    System.out.println("set contains=3");
    System.out.println(set.size());
    System.out.println();
    //Iteration---------------
    Iterator<Integer> it=set.iterator();
    while(it.hasNext())
    System.out.println(it.next());
    }
}
