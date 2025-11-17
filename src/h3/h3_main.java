//by mschro67

package h3;

public class h3_main {
    public static void main(String[] args) {
        int[][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},new int[15]};

        for (int y = 0; y < einheiten[0].length; y++) {
            einheiten[1][y] = einheiten[0][y]/100;
        }

        System.out.print("einheiten: ");
        for (int y = 0; y < einheiten.length; y++) {
            for (int z = 0; z < einheiten[y].length; z++) {
                System.out.print(einheiten[y][z] + " ");
            }
            System.out.print(",");
        }
    }
}