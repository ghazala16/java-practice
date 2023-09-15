import java.util.LinkedList;

public class hashmap_implementation<k,v> {//generic
    private class node{
        k key;
        v value;
        public node(k key,v value)
        {
            this.key=key;
            this.value=value;
        }
    }
    private int size;
    private LinkedList<node>buckets[];
    private int n;
    public hashmap_implementation()
    {
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++)
        {
            this.buckets[i]=new LinkedList<>();
        }
    }
    public void put(k key,v value)
    {
        int bkt_idx=SearchInLL(key);
    }
    private int hashFunction(k key)
    {
        int hc =key.hashcode();
        return Math.abs(hc)%n;

    }
    private int SearchInLL(k key,int bkt_idx)
    {
        LinkedList<node> ll=buckets[bkt_idx];
        int data_idx=0;
        for(int i=0;i<ll.size();i++)
        {
            node node=ll.get(i);
            if(node.key==key)
            {
                return data_idx;
            }
            data_idx++;
        }
        return -1;
    }
    public void put(k key,v value)
    {
        
    }
}
