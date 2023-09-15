import java.util.PriorityQueue;

public class heap_store_obj_in_priority_queue
{
    static class Student implements Comparable<Student>{ // create a class student //overriding
        String name;
        int rank;
    
    public Student(String name,int rank)//constructor
    {
        this.name=name;
        this.rank=rank;
    }
    @Override ///with this we can compare
    public int compareTo(Student s2) {
        return this.rank-s2.rank;
    }
}
    public static void main(String[] args) {
        PriorityQueue<Student> pq= new PriorityQueue<>();//use Comparator.reverseOrder to reverse the output
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);//now peek obj
            pq.remove();//now remove acc to priority from priority queue
        }
    }

}