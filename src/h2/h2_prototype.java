//by mschro67

package h2;

public class h2_prototype {
    public static void main(String[] args) {
        int n = 201, digits;
        int[] a = new int[9];

        digits = 0;
        int z = n;

        while (z > 0) {
            z /= 10;
            digits += 1;
        }

        System.out.println("digits: " + digits);

        for (int x = digits; x > 0; x--) {
            System.out.println("x: " + x);
            z = n;
            for (int y = 1; y < x; y++) {
                z /= 10;
                System.out.println("! y: " + y + ", z: " + z);
            }
            int b = 1;
            for (int y = 1; y < x; y++) {
                b *= 10;
            }
            a[8] = n - z * b;
            System.out.println("a: " + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4] + "," + a[5] + "," + a[6] + "," + a[7] + "," + a[8]);
        }
        System.out.println("a: " + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4] + "," + a[5] + "," + a[6] + "," + a[7] + "," + a[8]);
    }
}