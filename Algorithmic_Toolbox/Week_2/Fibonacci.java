import java.io.*;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

class Fibonacci {
    public static int fib(int n)
    {
        if (n <= 1) {
            return n; 
        }
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        long startime = Instant.now().toEpochMilli();
        int n = 10;
        System.out.println(n + "th Fiboncci Number: " + fib(n));
        long endtime = Instant.now().toEpochMilli();
        long timeElapsed = endtime - startime;
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
}