public class GCD {

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        num1 = num1 % num2;
        return gcd(num2, num1);
    }

    public static void main(String[] args) {
        System.out.println(gcd(3918848, 1653264));
    }
}