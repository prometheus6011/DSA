public class LastDigitFibonacci2 {

    public static long acc(int m) {
        long a = 0;
        long b = 1;
        long temp = 0;

        for(int i = 2; i <= m; i++) {
            temp =  a +b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static long fib(int m, int n) {
        long a = acc(m % 60);
        long b = acc((m + 1) % 60);
        long temp = 0;

        if(m == n) {
            return a % 10;
        }

        long count = a + b;

        for(int i = m + 2; i <= n % 60; i++) {
            temp = a + b;
            a = b;
            b = temp;
            count += b;
        }

        return count % 10;
    }

    public static void main(String[] args) {

        System.out.println(fib(10, 200));
    }
}
