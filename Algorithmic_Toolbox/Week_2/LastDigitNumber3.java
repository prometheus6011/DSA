public class LastDigitNumber3 {

    public static long fib(int n) {
        long a = 0;
        long b = 1;
        long temp = 1;
        long count = a + b;

        n = n % 60;

        for(int i = 2; i <= n; i ++) {
            temp = a + b;
            a = b;
            b = temp;
            count += b * b;
        }

        return count % 10;
    }

    public static void main(String[] args) {

        System.out.println(fib(1234567890));
    }
    
}
