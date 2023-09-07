public class last_digit_fib {

    public static int last_digit(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = (a + b) % 10;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.println(last_digit(331));
    }
}
