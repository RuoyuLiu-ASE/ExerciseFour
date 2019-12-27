package Exercise6.TaskFive;

/**
 * @author: Alan
 * @create: 2019-11-27 19:45
 * @function:
 * @version:
 * @important value:
 */
public class CaesarCipher {
    public static void main(String[] args) {
        String cipher = "Mjqqt, N 1nxm 3tz f 1tsijwkzq j0jsnsl.\n" +
                "N 1fx 1fnynsl tzyxnij 3tzw mtzxj gjhfzxj ymj ittw 1fxs'y qthpji.\n" +
                "N hfs fxxzwj 3tz ymfy st gzwlqfwx tw ymnj0jx mf0j jsyjwji.\n" +
                "N 1nxm 3tz f Rjww3 Hmwnxyrfx fsi f Mfuu3 Sj1 3jfw.";
 //       decrypt("Hfjxfw");// Though this method, find the shift number is 5.
        System.out.println(information(cipher));
    }

    public static void decrypt(String target) {
        String info="";
        int n; // This is the number of shifting
        char[] result = new char[target.length()];
        for (n = 1; n<26; n++) {
            for (int i=0; i < target.length(); i++) {
                if (target.charAt(i)<97 && target.charAt(i)>64){
                    result[i] = (char)((target.charAt(i)- 65 - n)%26+65);
                }else if (target.charAt(i) > 90){
                    result[i] = (char)((target.charAt(i)-97-n)%26+97);
                }
            }
            info = String.valueOf(result);
            System.out.println(info);
        }
    }

    public static String information(String cipher) {
        char[] oldInfo =  cipher.toCharArray();
        char[] plain=new char[cipher.length()];
        for (int i = 0; i < cipher.length(); i++) {
            if (oldInfo[i]<97 && oldInfo[i]>64){     // 大写字母
                plain[i] = (char)((oldInfo[i]- 65 - 5)%26+65);
            }else if (oldInfo[i] > 90){ // 小写字母
                plain[i] = (char)((oldInfo[i]-97-5)%26+97);
            } else if (oldInfo[i] < '6' && oldInfo[i] >= '0') {    //小写字母
                plain[i] = (char)((oldInfo[i]- 48 + 26- 5)%26+97);
            } else {
                plain[i] = oldInfo[i];
            }
        }
/*        for (int i = 0; i < cipher.length(); i++) {
            if (oldInfo[i] == ',') {
                plain[i] = oldInfo[i];
            } else if (oldInfo[i]<97){  //大写字母
                plain[i] = (char) ((oldInfo[i] - 65 - 5)%26+65);
            } else if (oldInfo[i] > 90) { //小写字母
                plain[i] = (char) ((oldInfo[i] - 97 - 5) % 26 + 97);
            }
        }*/
        return String.valueOf(plain);
    }
}
