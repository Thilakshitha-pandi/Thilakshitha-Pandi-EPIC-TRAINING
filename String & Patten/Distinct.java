Distinct 

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            val = val - 97;
            arr[val]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (val >= 65 && val <= 90) {
                val = val + 32;
            }
            val = val - 97;
            if (arr[val] == 1) {
                System.out.println(str.charAt(i) + " - " + arr[val]);
                arr[val] = 0;
            }
        }
    }
}
