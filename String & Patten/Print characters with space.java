1. Print characters with space
   Sample Input: Hello
   Sample Output: H e l l o

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		String str1 = "";
		for (int i = 0 ; i < str.length() ;i++){
		    str1 += (str.charAt(i)+" ");
		}
		System.out.println(str1);
	}
}
