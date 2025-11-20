//by mschro67

package p1;

public class p1_main{
    public static void main(String[] args){
        int x=0;
        while (x<=10){
            x=x+1;
            System.out.println(x);
        }

        System.out.println("for");
        for (int y=1;y<=11;y++){
            System.out.println(y);
        }

        System.out.println("do while");
        int z=0;
        do{
            z++;
            System.out.println(z);
        }while (z<=10);
    }
}
