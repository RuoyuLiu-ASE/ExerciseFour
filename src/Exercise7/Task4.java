package Exercise7;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: Alan
 * @create: 2019-12-04 19:29
 * @function:
 * @version:
 * @important value:
 */
public class Task4 {
    public static void main(String[] args) {
        final int INPUT = 3;
        int length = INPUT*(INPUT+1)/2;
        int index = 0; // For print out  array.
        int[] print=seriesArray(INPUT);
        System.out.print("[");
        for (int i = 1; i <= INPUT ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(print[index]+",");
                index += 1;
            }
            System.out.print(" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println(Arrays.toString(print));
    }

    public static int[] seriesArray(int n){
        int[] result = new int[n*(n+1)/2];
        int length = result.length;
        // i stands for the number of groups
        for (int i = n; i > 0; i--) {
            //j stands for the number in every groups
            for (int j = i; j > 0; j--) {
                result[length-1] = j;
                length -= 1;
            }
        }
        return result;
    }
}
