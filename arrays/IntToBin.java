package arrays;
import java.util.*;
import java.io.*;


public class IntToBin {
    String convToBin(int n){
        if(n=='0')return "0";
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();

    }
    int convToInt(String s){
        int res=0;
        int pow=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                res+=Math.pow(2,pow);
                
            }
            pow++;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        IntToBin obj=new IntToBin();
        String res=obj.convToBin(n);
        int r=obj.convToInt(res);
        System.out.println(res);
        System.out.print(r);
    }
}
