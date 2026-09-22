String Pattern print 

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        for (int i = 0; i < n ; i++){
            for (int j = i ; j < n ; j++){
                System.out.print("");
                for (int k = i ; k <= j; k++){
                    System.out.print(str.charAt(k));
                    if (k < j) {
                        System.out.print("");
                    }
                }
                System.out.println("");
            }
            System.out.println();
        }
    }
}
