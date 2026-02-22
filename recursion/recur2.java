import java.lang.Object;
import java.util.Scanner;

public class recur2 {
    private void printName(int i,int n,String s){
        if(i>n)return;
        System.out.println(i+"."+s);
        i++;
        printName(i,n,s);
    }
    private void print1toN(int i,int n){
        if(i>n)return ;
        System.out.print(i+" ");
        i++;
        print1toN(i,n);
    }
    private void printNto1(int n){
        if(n==0)return ;
        System.out.print(n+ " ");
        n--;
        printNto1(n);
    }
    private void bt1toN(int i,int n){
        if(i<1)return;
        bt1toN(i-1, n);
        System.out.print(i+" ");
    }
    private void btNTo1(int i,int n){
        if(i>n)return;
        btNTo1(i+1, n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        recur2 obj=new recur2();
        obj.printName(1, 10, "Tamal");
        System.out.println();
        obj.print1toN(1, 10);
                System.out.println();

        obj.printNto1(10);
                System.out.println();

        obj.bt1toN(10, 10);
                System.out.println();
        obj.btNTo1(1, 10);
    }
}
