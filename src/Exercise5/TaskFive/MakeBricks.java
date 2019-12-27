package Exercise5.TaskFive;

/**
 * @author: Alan
 * @create: 2019-11-20 21:33
 * @function:
 * @version:
 * @important value:
 */
public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3,1,8));
        System.out.println(makeBricks(3,1,9));
        System.out.println(makeBricksRecursion(3,2,10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int result = 0;
        // Double for loop to find the all possible results.
        for (int i = 0; i <= small; i++) {
            // i represents the number of 1 inch brick
            for (int j = 0; j <= big; j++) {
                // j represents the num of 5 inch bricks
                result = i*1+ j*5;
                if (result == goal) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean makeBricksRecursion(int small, int big, int goal) {
        if (small < 0 || big < 0) {     //Stop conditon
            return false;
        } else if (goal == 0) {     //Stop condition
            return true;
        }
        return (makeBricksRecursion(small-1,big,goal-1)|| makeBricksRecursion(small,big-1,goal-5));
    }
}
