public class LastDigitFibonacci {
    public static final int PISANO_PERIOD_MOD10 = 60;

    public static long fib(int n) {
        n = n % PISANO_PERIOD_MOD10;
        long a = 0;
        long b = 1;
        long temp = 0;
        long acc = a + b;

        for(int i = 2; i <= n; i++) {
            temp = (a + b) % 10;
            a = b;
            b = temp;
            acc += b;
        }

        return acc % 10;
    }

    public static void main(String[] args) {

        System.out.println(fib(100));
    }
}
