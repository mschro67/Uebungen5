//by mschrp67

package h1;

public class h1_main{
    public static void main(String[] args){
        int[] myArray={5,6,7,10,12,23,56};

        int[] x=new int[myArray.length];
        int z=0;

        for (int y=myArray.length-1;y>=0;y--){
            //System.out.println(myArray[y]);
            x[z]=myArray[y];
            z+=1;
        }
        myArray=x;

        System.out.print("myArray: ");
        for (int y=0;y<myArray.length;y++){
            System.out.print(myArray[y]+" ");
        }
    }
}
