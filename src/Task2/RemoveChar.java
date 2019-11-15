package Task2;

/**
 * @author: Alan
 * @create: 2019-11-11 11:00
 * @function: remove a target char in a String which is implied by index
 * @version: 1.0
 * @important value:
 */
public class RemoveChar {
    public static void main(String[] args) {
        String outputStr;     // This is the output string

        outputStr = missingChar("kitten",0);
        System.out.println(outputStr);
    }
    public static String missingChar(String str, int n) {
        if (n > str.length() - 1) {
            return ("Please input a valid index!");
        }
        else {
            return(str.replaceFirst(str.substring(n,n+1),""));
        }
    }
}
