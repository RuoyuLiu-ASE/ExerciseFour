package Task4;

/**
 * @author: Alan
 * @create: 2019-11-11 11:54
 * @function:
 * @version:
 * @important value:
 */
public class ArrayWave {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1};
        int[] nums2 = {1,7,2,4,5};
        int[] nums3 = {1,4,2,1,9,8};
        System.out.println(arraywave(nums ));
    }

    public static boolean arraywave(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length-1; i++) {
            //First situation: The first number is smaller than the second one
            if (nums[i]<nums[i+1]) {
                flag += 1;
                continue;
            } else if (nums[i]>nums[i+1]) {
                flag -= 1;
                continue;
            } else if (nums.length < 2) {
                System.out.println("Please input valid numbers array which length is bigger than 1.");
                return false;
            }
        }
        return (flag == 0);
    }
}
