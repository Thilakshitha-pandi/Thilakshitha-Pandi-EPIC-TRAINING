Distinct elements


import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n= in.nextInt();
	    List<Integer> li = new ArrayList<>();
	    //10 20 10 20 30
	    for(int i=0;i<n;i++){
	        li.add(in.nextInt());
	    }
	    
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
	    for(int val : li){
	        //set[30]
	        if(!set.add(val)){
	            dup.add(val);
	        }
	    }
	    set.removeAll(dup);
	    System.out.println(set);
	    
	}
}
