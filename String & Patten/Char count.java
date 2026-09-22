Char count

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
            if (arr[val] != 0) {
                System.out.println(str.charAt(i) + " - " + arr[val]);
                arr[val] = 0;
            }
        }
    }
}

                                                                  OR

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();//abcd
		int[] count = new int[26];
	
		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;
		    count[val]++;
		}
		System.out.println();
// 		for(int i=0;i<26;i++){
// 		    if(count[i]>0)
// 		    System.out.println((char)(i+97)+" "+count[i]+" ");
// 		}
		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;
		    if(count[val]>0){
		        System.out.println(str.charAt(i)+" "+count[val]);
		    }
		    if(count[val]>1){
		        count[val]=0;
		    }
		}
	}
}



