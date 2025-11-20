//by mschro67

package p2;

public class p2_main{
    public static void main(String[] args){
        int[] numbers={1,-8000,5};
        int max,minIndex;

        max=numbers[0];
        minIndex=0;

        for (int x=0;x<numbers.length;x++){
            if (numbers[x]>max){
                max=numbers[x];
                minIndex=x;
            }
        }

        System.out.println("max: "+max+", minIndex: "+minIndex);
    }
}