/*import java.util.ArrayList;
//INSERT IN HEAP
public class heap_child_to_parent_sort {
    static class heap{
        ArrayList<Integer> arr=new ArrayList<>();
    
    public void add(int data)//add at last position
    {
        arr.add(data);
        int  x=arr.size()-1;
        int par=(x-1)/2;
        while(x>0 && arr.get(x)<arr.get(par))//-----0(logn)//min heap
        {
            int temp=arr.get(x);
        arr.set(x,arr.get(par));
        arr.set(par,temp);
        /*x=par;
        par=(x-1)/2;
        /*System.out.println(par);
        System.out.println(x);
        }
        
    }
}
public static void main(String[] args) {
    heap h = new heap();
    int arr[]={2,13,4,25,6};
    for(int num:arr){
    h.add(num);
    }
    System.out.println(h.arr);
   
}
}
*/



// Max-Heap data structure in Java

import java.util.ArrayList;

class heap_child_to_parent_sort {

  void heapify(ArrayList<Integer> hT, int i)
  {
    int size = hT.size();
    int largest = i;//It initializes largest with the current index i, which is assumed to be the largest element at the moment.
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < size && hT.get(l) > hT.get(largest))
      largest = l;
    if (r < size && hT.get(r) > hT.get(largest))
      largest = r;

    if (largest != i) {//If largest is not equal to i, it means that the current node is not the largest among its children. In this case, it swaps the value at index i with the value at index largest to move the larger value upwards in the heap
      int temp = hT.get(largest);
      hT.set(largest, hT.get(i));
      hT.set(i, temp);

      heapify(hT, largest);//he method calls itself recursively on the index largest. This ensures that the subtree rooted at the node originally at index i is also adjusted to satisfy the max-heap property.
    }
  }

  void insert(ArrayList<Integer> hT, int newNum) {
    
    int size = hT.size();
    if (size == 0) {
      hT.add(newNum);
    } else {
      hT.add(newNum);
      //insert the newNode at the end (last node from left to right.)
      for (int i = size / 2 - 1; i >= 0; i--) {//, it enters a loop that starts from the parent of the last element (size / 2 - 1) and goes up to the root node (index 0). This loop iterates through each level of the heap (from bottom to top).
        heapify(hT, i);//heapify is called to correct the max heap tree after insertion
      }
    }
  }


 /*  void deleteNode(ArrayList<Integer> hT, int num)
  {
    int size = hT.size();
    int i;
    for (i = 0; i < size; i++)
    {
      if (num == hT.get(i))
        break;
    }

    int temp = hT.get(i);
    hT.set(i, hT.get(size-1));
    hT.set(size-1, temp);

    hT.remove(size-1);
    for (int j = size / 2 - 1; j >= 0; j--)
    {
      heapify(hT, j);
    }
  }
  */



  void printArray(ArrayList<Integer> array, int size) {
    for (Integer i : array) {///for each loop which indicates for every i in array
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {

    ArrayList<Integer> array = new ArrayList<Integer>();
    int size = array.size();
    
    heap_child_to_parent_sort h = new heap_child_to_parent_sort();
    h.insert(array, 1);
    h.insert(array, 2);
    h.insert(array, 3);
    h.insert(array, 4);
    h.insert(array, 5);
    h.insert(array, 6);
    h.insert(array, 7);
    h.insert(array, 8);
    h.insert(array, 9);
    h.insert(array, 10);
    h.insert(array, 11);
    h.insert(array, 12);
    h.insert(array, 13);
    h.insert(array, 14);
    h.insert(array, 15);
    //System.out.println(array.size());
    System.out.println("Max-Heap array: ");
    h.printArray(array, size);

    /*h.deleteNode(array, 4);
    System.out.println("After deleting an element: ");
    h.printArray(array, size);*/
  }
}