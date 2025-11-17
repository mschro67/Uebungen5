//by mschro67

package h2;

public class h2_main {
    public static void main(String[] args) {
        int n = 201, digits;
        int[] a = new int[9];

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