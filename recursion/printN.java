
import java.io.*;
import java.lang.Object;

public class printN {
    private int a=1;
    private int N=Integer.MIN_VALUE;
    private void print1ToN(int n){
        if(a==1){
            N=n;
        }
        if(a>N)return;
        
        
        
        System.out.println(a);
        a++;
        print1ToN(a);
    }
    private void printNTo1(int n){
        System.out.print(n);
        if(n==1)return;
        printNTo1(--n);
    }
    public static void main(String[] args) {
        int n=10;
        printN obj=new printN();
        obj.print1ToN(n);
        obj.printNTo1(n);
    }
}
