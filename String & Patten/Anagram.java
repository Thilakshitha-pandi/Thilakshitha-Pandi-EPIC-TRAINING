Anagram

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = in.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 97;
            arr[val]++;
        }

    for (int i = 0; i < str2.length(); i++) {
            int val = str2.charAt(i) - 97;
            arr[val]--;   
        }
        boolean ana = true;
        for(int i = 0 ; i < 26 ; i++){
            if (arr[i] != 0){
                ana = false;
                break;
            }
        }
        if(ana){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
