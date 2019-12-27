package Exercise5.TaskFour;

import java.util.Arrays;

/**
 * @author: Alan
 * @create: 2019-11-18 22:11
 * @function:
 * @version:
 * @important value:
 */
public class NoTriples {
    public static void main(String[] args) {
//        int[] nums1 = {1,1,2,2,1};
        int[] nums2 = {1,1,2,2,2,1};
        int[] nums3 = {1,1,1,2,2,2,1};
        System.out.println(noTriples(new int[]{1,2,2,3,4,5,5,2}));
        System.out.println(noTriples(nums2));
        System.out.println(noTriples(nums3));
    }

    public static boolean noTriples(int[] nums) {
        for(int i=0; i<nums.length-2;i++){
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }
}

