package string;
import java.util.*;
import java.io.*;
public class checkAnagramm {
    boolean check(String s,String t){
        if(s.equals(t))return true;
        if(s.length()!=t.length())return false;
        char[] s_c=s.toCharArray();
        char[] t_c=t.toCharArray();
        Arrays.sort(s_c);
        Arrays.sort(t_c);
        return Arrays.equals(s_c,t_c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        
        
        String t=sc.next();
        sc.close();
        checkAnagramm obj=new checkAnagramm();
        System.out.print(obj.check(s,t));
    }
}
