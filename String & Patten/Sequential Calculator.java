INPUT 12345-+*/ OUTPUT 1

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int out = str.charAt(0) - '0';
        int len = (str.length() / 2) ;
        for (int i = len +1; i < str.length(); i++) {
            int val = str.charAt(i- len)- '0';
            switch (str.charAt(i)) {
                case '-':
                    out -= val;
                    break;
                case '+':
                    out += val;
                    break;
                case '*':
                    out *= val;
                    break;
                case '/':
                    out /= val;
                    break;
                case '%':
                    out %= val;
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println(out);
        }
        System.out.println(out);
    }
}
