package recursion;

// Recursion - function that calls itself.

public class DemoTwo {
    public static void main(String[] args) {
        // write a function that prints 1 to 5
        print(1);
    }

    public static void print(int n){
        // Base condition -  condition where recursion stop making new calls.
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // Recursive call
        print(n + 1);
    }
}
