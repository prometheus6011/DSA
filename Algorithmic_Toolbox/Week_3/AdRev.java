import java.util.*;

public class AdRev {

    public static long maxAdRev(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        long result = 0;
        for(int i = 0; i < nums1.length; i++) {
            result += (long) nums1[i] * nums2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];

        for(int i  = 0; i < n; i++) {
            nums1[i] = scanner.nextInt();
        }
        for(int i  = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        System.out.println(maxAdRev(nums1, nums2));
        scanner.close();
    }
}