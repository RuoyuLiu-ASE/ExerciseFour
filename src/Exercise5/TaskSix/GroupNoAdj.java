package Exercise5.TaskSix;

/**
 * @author: Alan
 * @create: 2019-11-20 21:52
 * @function:
 * @version:
 * @important value:
 */
public class GroupNoAdj {
    public static void main(String[] args) {
        int[] nums1 = {2,5,10,4};
        System.out.println(groupNoAdj(0,nums1,12));
        System.out.println(groupNoAdj(0,nums1,14));
        System.out.println(groupNoAdj(0,nums1,7));
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        //index is the index of the nums
        int index = start;
        int sum = 0;    // The sum of the group
        while (index < nums.length) {
            sum = sum + nums[index];
            index += 2;
        }
        if (sum == target) {
            return true;
        } else {
            return false;
        }
    }
}
