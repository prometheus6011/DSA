public class Fibonacci_Number_Again {

    public static long pisano(long m) {
        long prev = 0;
        long curr = 1;
        long res = 0;

        for(int i = 0; i < m * m; i++) {
            long temp = 0;
            temp = curr;
            curr = (prev + curr) % m;
            prev = temp;

            if (prev == 0 && curr == 1) {
                res = i + 1;
            }
        }
        return res;
    }

    public static long fib(long n, long m) {
        long pisanoPeriod = pisano(m);
        n = n % pisanoPeriod;
        long a = 0;
        long b = 1;
        long temp = 0;

        for(int i = 0; i < n - 1; i++) {
            temp = (a + b) % m;
            a = b;
            b = temp;
        }
        return (b % m);
    }

    public static void main(String[] args) {
        long n = 2816213588l;
        System.out.println(fib(n, 239));
    }
    
}
