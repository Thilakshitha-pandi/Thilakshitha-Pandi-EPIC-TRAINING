Sliding window in string 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str1 = in.nextLine();
	    String str2 = in.nextLine();
	    for(int i=0;i<=(str1.length()-str2.length());i++){
	        String temp = "";
	            for(int j=i;j<=(str2.length()-1)+i;j++){
	                temp = temp + str1.charAt(j);
	            }
	            boolean f = false ; 
	            for (int k = 0 ; k < str2.length() ; k++){
	                if (temp.charAt(k) == str2.charAt(k)){
	                    f = true;
	                    break;
	                }
	            }
	            if (f){
	                System.out.println("found");
	                return;
	            }
	        }
	        System.out.println("Not found");
	} }
