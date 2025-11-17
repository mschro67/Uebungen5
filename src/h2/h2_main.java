//by mschro67

package h2;

public class h2_main{
    public static void main(String[] args){
        int n = 201, digits;
        int[] a = new int[9];

        String string=String.valueOf(n);
        digits=string.length();

        for (int x=0;x<digits;x++) {
            char c=string.charAt(digits-x-1);
            a[8-x]= Integer.parseInt(String.valueOf(c));
        }
        System.out.println("a: " + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4] + "," + a[5] + "," + a[6] + "," + a[7] + "," + a[8]);
    }
}