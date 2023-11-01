public class checkSequence {
    static int checkSequence(int a, int d, int x) {
        // Write your code here.
        for(int i=1;i<=x;i++)
        if(a+i*d==x)
        return 1;
        return 0;

    }




    //The provided checkSequence function appears to be a simple implementation to check if a number x can be obtained by adding a sequence of arithmetic progression starting from a with a common difference d. The function iterates through the sequence using a loop and checks if any element in the sequence equals the given number x. If such an element is found, the function returns 1, indicating that the number can be obtained from the sequence. If no such element is found, the function returns 0.//1 2 7->o/p-----1
}
