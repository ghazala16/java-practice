import java.util.HashMap;
import java.util.Set;
public class hashmap_operation
{
    public static void main(String[] args) {
        HashMap <String,Integer> hm = new HashMap<>();
        //Insert---.put method
        hm.put("India",100);
        hm.put("USA",256);
        System.out.println(hm);//[India=100, USA=256]

        //.get method
        int population=hm.get("India");
        System.out.println(population);

        //contains key
        System.out.println(hm.containsKey("India"));
        //System.out.println(hm.remove("India"));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());


        Set<String> key = hm.keySet();
        System.out.println(key);
        for(String k:key)
        System.out.println("key="+k+",val="+hm.get(k));
    }

}