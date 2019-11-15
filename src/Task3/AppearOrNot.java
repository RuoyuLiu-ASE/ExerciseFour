package Task3;

/**
 * @author: Alan
 * @create: 2019-11-11 11:35
 * @function:
 * @version:
 * @important value:
 */
public class AppearOrNot {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,3,1,2};
        System.out.println(array123(nums));
    }

    public static boolean array123(int[] nums) {
        //这里是减去2还是减去3是需要弄清楚的。
        for (int n = 0; n<nums.length-2; n++) {
            if (nums[n] == 1) {
                if (nums[n+1] == 2) {
                    if (nums[n+2] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
