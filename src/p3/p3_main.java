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
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                matrix[x][y]++;
            }
        }
        display(matrix,"a");
        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                matrix[x][y]--;
            }
        }

        int summe=0;
        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                summe+=matrix[x][y];
            }
        }
        System.out.println("b");
        System.out.println(summe);
        System.out.println();

        int[][] m = new int[matrix.length][matrix[0].length];
        for (int x=0;x<matrix.length;x++){
            for (int y=0;y<matrix[x].length;y++){
                m[y][matrix.length-1-x]=matrix[x][y];
            }
        }
        display(m,"c");
    }
}