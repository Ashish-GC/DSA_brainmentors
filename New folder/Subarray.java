

    import java.util.*;
    public class Subarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the length of array :");
            int n = sc.nextInt();
              System.out.println("enter element :");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean found = hasZeroSumSubarray(arr);
            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        public static boolean hasZeroSumSubarray(int[] arr) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                // If the current element is zero or the sum is zero or the sum already exists in the set,
                // there is a subarray with zero sum.
                if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                    return true;
                }
                // Add the current sum to the set.
                set.add(sum);
            }
            return false;
        }

    }
