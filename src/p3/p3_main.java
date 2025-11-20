//by mschro67

package p3;

import java.util.Arrays;

public class p3_main{
    public static void display(int[][] matrix,String ex){
        System.out.println(ex);
        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++) {
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] backup=new int[3][3];
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                backup[x][y]=matrix[x][y];
            }
        }

        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                matrix[x][y]++;
            }
        }
        display(matrix,"a");
        matrix=backup;

        int summe=0;
        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                summe+=matrix[x][y];
            }
        }
        System.out.println("b");
        System.out.println(summe);
        System.out.println();

        int[][] m={{backup[2][0],backup[1][0],backup[0][0]},{backup[2][1],backup[1][1],backup[0][1]},{backup[2][2],backup[1][2],backup[0][2]}};
        matrix=m;
        display(matrix,"c");
    }
}
