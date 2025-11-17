//by mschro67

package h3;

public class h3_main{
    public static void main(String[] args){
        int[][] einheiten=new int[2][15];

        int[] x={50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        einheiten[0]=x;

        for (int y=0;y<einheiten[0].length;y++){
            einheiten[1][y]=einheiten[0][y]/100;
        }


    }
}
