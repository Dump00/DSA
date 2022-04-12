package recursion;

// Find nth Fibonacci number
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

public class DemoThree {
    public static void main(String[] args) {

        // f(N) = f(N-1) + f(N-2)
        // f(N-1) = f(N-2) + f(N-3)
        // Base condition - f(0) = 0, f(1) = 1

        int fibNumber = fibNum(10);
        System.out.println(fibNumber);
    }

    public static int fibNum(int n){
        //Base condition
        if(n < 2){
            return n;
        }
        return fibNum(n-1) + fibNum(n-2);
    }
}
