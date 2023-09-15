import java.util.PriorityQueue;

public class heap_weakest_soldier {
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        public Row(int soldier,int idx)
        {
            this.soldiers=soldier;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2)
        {
        if(this.soldier=r2.soldier)
        {
            return this.idx=idx;
        }
        else
        return this.soldiers-r2.soldiers;
    
        
    }
}
public static void main(String[] args) {
    int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
    int k=2;
    PriorityQueue<Row> pq=new PriorityQueue<>();
}
}
