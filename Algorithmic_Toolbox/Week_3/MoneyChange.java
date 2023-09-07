public class MoneyChange {

    private static int change(int cents) {
        int numCoins = 0;

        while(cents != 0) {
            if(cents - 10 >= 0) {
                numCoins++;
                cents -= 10;
            } else if (cents - 5 >= 0) {
                numCoins++;
                cents -= 5;
            } else if (cents - 1 >= 0) {
                numCoins++;
                cents -= 1;
            }
        }
    return numCoins;
    }

    public static void main(String[] agrs) {
        System.out.println(change(28));
    }

}
