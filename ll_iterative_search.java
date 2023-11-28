public class ll_iterative_search {
    public int itrSearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        System.out.println(ll.itrSearch(3));
    }
}
