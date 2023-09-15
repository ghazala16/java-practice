import java.util.Comparator;
import java.util.PriorityQueue;

public class heap_problems {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());///constructor k andr we have passed comparator.reverseOrder to reverse the output
       //with the help of comparision only we can sort elements and comparators define the output logic  wheter it should be asc or desc 
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
