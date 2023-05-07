public class Main{

    public static int fib(int n){
        // base case
        if (n <= 1){
            return n;
        }
        // recursion
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args){
        int n = 7;
        int result = 13;
        int output = fib(n);
        boolean out = (result == output);
        System.out.println(out);
    }
}
