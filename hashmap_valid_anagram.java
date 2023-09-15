import java.util.HashMap;
public class hashmap_valid_anagram
{
    public static boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            int count=map.get(c);
            if(map.get(c)!=null)
            {
            if(count==1)//If the character frequency in the map is 1, it means we have encountered one occurrence of the character from string t in the map. In this case, we remove the character from the map, as both strings should have an equal number of occurrences for each character. If the frequency is greater than 1, we decrement the frequency by 1 and update the map with the new frequency. This ensures that we are matching occurrences of characters between the two strings.
            map.remove(c);
            else
            map.put(c,count-1);
            }
            else
            return false;
            }
            
        return map.isEmpty();
    }


    /*-------------------------------------------------------------------- */
    /* private static int[] frequency = new int[26];

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for (char c : a.toCharArray()) {  //this for loop adds the items in array a
            frequency[(int) c - 97]++;
        }
        for (char c : b.toCharArray()) {// it matches that element from freq array and decreases its frequency from freq arr
            frequency[(int) c - 97]--;
        }
        
        boolean anagrams = true;
        for (int i : frequency) {
            if (i != 0) {
                anagrams = false;
                break;
            }
        }
        return anagrams;
    } */
public static void main(String[] args)
{
    String s="wracea";
    String t="carwea";
    System.out.println(isAnagram(s,t));
}
}

