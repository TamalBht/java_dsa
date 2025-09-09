package string;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {
    boolean isIso(String s,String t){
        if(s.length()!=t.length())return false;
        if(s.equals(t))return true;
        HashMap<Character,Character> hs1=new HashMap<>();
        HashMap<Character,Character> hs2=new HashMap<>();
        

        char[] temp_s=s.toCharArray();
        char[] temp_t=t.toCharArray();

        for(int i=0;i<t.length();i++){
            if(hs1.containsKey(temp_s[i])){
                char val=hs1.get(temp_s[i]);
                if(val!=temp_t[i])return false;
            }
            hs1.put(temp_s[i],temp_t[i]);
        }
        
        //reverse mapping 
        for(int i=0;i<t.length();i++){
            if(hs2.containsKey(temp_t[i])){
                char val=hs2.get(temp_t[i]);
                if(val!=temp_s[i])return false;
            }
            hs2.put(temp_t[i],temp_s[i]);
        } 
        return true;
    
    } 
    public static void main(String[]args){
        String s,t;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        t=sc.next();
        sc.close();
        Isomorphic obj=new Isomorphic();
        boolean val=obj.isIso(s, t);
        if(val)System.out.println("true");
        else System.out.println("False");
    }
}
