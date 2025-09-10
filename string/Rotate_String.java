package string;

import java.util.Scanner;

public class Rotate_String {
    String rotate(char[] inp){
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<inp.length;i++){
            sb.append(inp[i]);
        }
        sb.append(inp[0]);
        return sb.toString();

    }
    public boolean rotateString(String s, String goal){
        
        for(int i=0;i<s.length();i++){
            char[]temp_s=s.toCharArray();
            String res=rotate(temp_s);
            if(res.equals(goal)) return true;
            else{
                s=res;
            }
        }
        return false;
    }
    

    public static void main(String[]args){
        String s,t;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        t=sc.next();
        sc.close();
        Rotate_String obj=new Rotate_String();
        boolean val=obj.rotateString(s, t);
        if(val)System.out.println("true");
        else System.out.println("False");
    }
}
