import java.util.*;
import java.lang.*;
import java.io.*;


public class AltUpLow {
    private String method1(String s){
        StringBuffer sb= new StringBuffer();
        int n=s.length();
        for(int i=0;i<n;i++){
            char temp =s.charAt(i);
            if(i%2!=0){ 
                temp=Character.toUpperCase(temp);
                
            }
            else{
                temp=Character.toLowerCase(temp);
            }
            sb.append(temp);
        }
        return new String(sb);
    }
    private String method2(String s ){
        //using ASCII value 
        
        StringBuffer sb= new StringBuffer();
        boolean setUpper=false;
        for(char ch:s.toCharArray()){
            if(setUpper){
                if(ch>='a' && ch<='z')ch=(char)(ch-32);
            }else {
                if(ch>='A' && ch<='Z')ch=(char)(ch+32);
                }
                sb.append(ch);
                setUpper=!(setUpper);
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        String s="abcde";
        AltUpLow obj=new AltUpLow();
        System.out.println(obj.method1(s));
        System.out.println(obj.method2(s));
    }
}
