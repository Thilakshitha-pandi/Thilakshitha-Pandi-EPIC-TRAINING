2nd largest

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		Scanner in = new Scanner (System.in);
		int n = in.nextInt(); //6
		for (int i = 0 ; i <n ; i++){
		    li.add(in.nextInt());//10 45 20 78 34 56
		}
		int max = Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE ;
		for (int i = 0 ; i < n ; i++ ){
		    if (li.get(i) > max ){
		        sl = max;
		        max = li.get(i);
		    }
		    else if(sl < li.get(i) && li.get(i) < max){
		        sl = li.get(i);
		    }
		}
		System.out.println(li);
		System.out.println(max);
		System.out.println(sl);
	}
}
