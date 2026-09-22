String-num-Length

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String word = "";
        for (int i =0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            int c = 0;
            if (ch < '0' || ch > '9'){
                word +=ch;
            }else{
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    c = c * 10 +(str.charAt(i) - '0');
                    i++;
                }
                for (int j = 0 ; j < c ; j++){
                    System.out.print(word);
                }
                word = "";
                i--;
            }
        }
    }
}
