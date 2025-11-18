//by mschro67

package h2;
import java.util.Scanner;


public class h2_main{
    public static void main(String[] args){
        System.out.print("Input: ");
        Scanner s=new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine()), digits;
        int[] a = new int[9];

        s.close();

        String string = String.valueOf(n);
        digits = string.length();

        for (int x = 0; x < digits; x++) {
            char c = string.charAt(digits - x - 1);
            a[8 - x] = Integer.parseInt(String.valueOf(c));
        }

        System.out.print("a: ");
        for (int y = 0; y < a.length; y++) {
            System.out.print(a[y] + " ");
        }
    }
}