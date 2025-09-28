package string;

import java.util.Scanner;

public class Atoi {
    public int myAtoi(String s) {
         StringBuilder sb= new StringBuilder();
         //removing the white spaces
         int i=0;
         while(s.charAt(i)==' ')i++;
         //check if the next two are signs or not 
         if(i<s.length()-1 && !(Character.isDigit(s.charAt(i))) && !(Character.isDigit(s.charAt(i+1))) )return 0;
         for(int j=i;j<s.length();j++){
            char c=s.charAt(j);
            if(c=='-' &&sb.isEmpty())sb.append(c);
            else if(c=='+' && sb.isEmpty() || c==' ') continue;
            else if(Character.isDigit(c))sb.append(c);
            else break;
         }
        
        String rs=sb.toString();
       if(rs.length()==1 && !Character.isDigit(rs.charAt(0)))return 0;
        if(sb.isEmpty())return 0;
        long n= Long.parseLong(rs);
        if(n>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(n < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)n;
    }

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        Atoi obj=new Atoi();
        int res=obj.myAtoi(str);
        System.out.print(res);
        
    }
}
