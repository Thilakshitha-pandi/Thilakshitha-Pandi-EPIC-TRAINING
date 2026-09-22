//Look-and-Say sequence(Conway's sequence)
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = "1";  
		for (int i = 1 ; i <= n ; i++){
		    System.out.println(str);
		    int c = 1;
		    String seq = "";
		    for (int j = 0; j < str.length() ; j++){
		        if ( j+1 < str.length() && str.charAt(j) == str.charAt(j+1)){
		            c = c + 1;
		        }else{
		            seq = seq + c + str.charAt(j);
		            c = 1;
		        }
		    }
		    str = seq;
		}
	}
}
