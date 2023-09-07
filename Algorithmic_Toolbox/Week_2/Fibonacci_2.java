import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Fibonacci_2 {

    public static int[] FibList(int n) {
        int[] F = new int[n];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i < n; i++ ) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F;
    }

    public static void main(String[] args) {

        long startime = Instant.now().toEpochMilli();

        int[] FibList = FibList(10);

        System.out.print("[ ");
        for(int i = 0; i < FibList.length; i++) {
            System.out.print(FibList[i] + " ");
        }
        System.out.println("]");

        long endtime = Instant.now().toEpochMilli();
        long timeElapsed = endtime - startime;
        System.out.println("Execution time in milliseconds: " + timeElapsed);

    }
}
