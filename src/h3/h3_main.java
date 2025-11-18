//by mschro67

package h3;

public class h3_main {
    public static void main(String[] args) {
        int input=3502;
        int[][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},new int[15]};

        double euro=input/100;

        System.out.println("input: "+input+"ct ~= "+euro+"€");
        System.out.println();

        for (int y = 0; y < einheiten[0].length; y++) {
            einheiten[1][y] = input/einheiten[0][y];
            input-=einheiten[1][y]*einheiten[0][y];
        }

        for (int z = 0; z < einheiten[0].length; z++) {
            if (einheiten[1][z]>0) {
                if (einheiten[0][z]<100) {
                    System.out.println(einheiten[1][z]+"x "+einheiten[0][z] + "ct");
                }else{
                    System.out.println(einheiten[1][z]+"x "+einheiten[0][z]/100 + "€");
                }
            }
        }
    }
}