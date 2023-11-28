public class checkSequence {
    static int checkSequence(int a, int d, int x) {
        // Write your code here.
        for(int i=1;i<=x;i++)
        if(a+i*d==x)
        return 1;
        return 0;

    }


//MORE OPTIMISED CODE--------------------------------

    /*//The provided checkSequence function appears to be a simple implementation to check if a number x can be obtained by adding a sequence of arithmetic progression starting from a with a common difference d. The function iterates through the sequence using a loop and checks if any element in the sequence equals the given number x. If such an element is found, the function returns 1, indicating that the number can be obtained from the sequence. If no such element is found, the function returns 0.//1 2 7->o/p-----1
    if (a == 0 && d == 0 && x == 0) {
        return 1; // Sequence is [0, 0, 0]
    }
    
    // Check if d is zero
    if (d == 0) {
        return (a == x) ? 1 : 0; // Check if a equals x
    }
    
    // Check if x can be obtained from the arithmetic sequence
    if ((x - a) % d == 0 && (x - a) / d >= 0) {
        return 1;
    } else {
        return 0;
    }*/
}
