//by mschro67

package h2;

public class h2_main{
    public static void main(String[] args){
        int n=201,digits;
        int[] a=new int[9];

        digits=0;
        int z=n;
        int b;

        while (z>0) {
            z /= 10;
            digits += 1;
        }

        for (int x=1;x<=digits;x++) {
            System.out.println("x: " + x);
            z=n;
            for (int y = 1; y <= x; y++) {
                b=z/10;
                z=z-b*10;
                System.out.println("z: "+z);
            }
        }

        System.out.println("digits: "+digits);
    }
}
