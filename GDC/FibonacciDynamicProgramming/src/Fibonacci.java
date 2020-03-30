public class Fibonacci {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(4));
    }

    /** Get the fibonacci number at specific index*/
    public static int fib(int index){
        if (index == 1)
            return 1;
        if (index == 0)
            return 0;

        int fib1 = 0;
        int fib2 = 1;
        int fibIndex = 0;

        for (int i = 2; i <= index; i++){
            fibIndex = fib1 + fib2;

            fib1 = fib2;
            fib2 = fibIndex;
        }

        return fibIndex;
    }
}
