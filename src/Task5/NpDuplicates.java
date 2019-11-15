package Task5;


import java.util.Arrays;

/**
 * @author: Alan
 * @create: 2019-11-11 12:49
 * @function:
 * @version:
 * @important value:
 */
public class NpDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,9,2,3,8};
        int[] nums2 = {1,1,2,2,2,1};
        int[] nums3 = {1,8,6,1,3};
        System.out.println(noDuplicates(nums3));
    }

    public static boolean noDuplicates(int[] nums) {
        // first step: sort out the numbers, then compare the neighboring numbers
        Arrays.sort(nums);
        for (int n: nums) {
            System.out.print(n);
        }
        System.out.println("");
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
