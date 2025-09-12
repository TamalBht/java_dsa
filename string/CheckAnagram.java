package string;

import java.util.*;

public class CheckAnagram {
    boolean isAnagram(String s,String t){
        if(s.equals(t))return true;
        if(s.length()!=t.length())return false;
        
        char[] temp_s=s.toCharArray();
        char[] temp_t=t.toCharArray();
        
        Arrays.sort(temp_s);
        Arrays.sort(temp_t);
        return Arrays.equals(temp_s, temp_t);
    }
    public static void main(String[]args){
        String s,t;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        t=sc.next();
        sc.close();
        CheckAnagram obj=new CheckAnagram();
        boolean val=obj.isAnagram(s, t);
        if(val)System.out.println("true");
        else System.out.println("False");
    }
}
