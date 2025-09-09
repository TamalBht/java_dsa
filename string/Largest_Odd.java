package string;

import java.util.Scanner;

public class Largest_Odd {
    String largestOdd(String num){
        int number=Integer.parseInt(num);
        while(number>0){
            if((number%10)%2!=0)return String.valueOf(number);
            else{
                number=number/10;
            }
        }
        return "";

    }
    //for large numbers
    String largestOddd(String num){
        if(num.isEmpty())return "";
        int ptr=num.length()-1;
        
        while(ptr>=0){
            
            char last_char=num.charAt(ptr);
            int number=last_char-'0';
            if(number%2!=0)break;
            else{
                ptr--;
            }
        }
        if(ptr<0)return "";
        return num.substring(0, ptr+1);
    }

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        Largest_Odd obj=new Largest_Odd();
        String res=obj.largestOddd(str);
        System.out.print(res);
        
    }
}
