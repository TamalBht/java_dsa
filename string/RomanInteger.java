package string;

import java.util.Scanner;

public class RomanInteger {
    int basic_conv(Character c){
        if(c=='I')return 1;
        else if(c=='V')return 5;
        else if(c=='X')return 10;
        else if(c=='L')return 50;
        else if(c=='C')return 100;
        else if(c=='D')return 500;
        else return 1000;
    }
    public int romanToInt(String s) {
        int res=0,pt=0;
        for(int i=0;i<s.length();i++){
            pt=basic_conv(s.charAt(i));
            if(i<s.length()-1 ){
                int pt1=basic_conv(s.charAt(i+1));
                if(pt1>pt){
                    pt=pt1-pt;
                    i++;
                }
            }
            res+=pt;
            
        }
        return res;
    }

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        RomanInteger obj=new RomanInteger();
        int res=obj.romanToInt(str);
        System.out.print(res);
        
    }
}
