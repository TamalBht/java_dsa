import java.util.*;
import java.lang.*;
import java.io.*;


//char to ascii (for alphabets) then the maximu digit in the 2 digit or 3digit number finally return the sum of max of each iteration
public class ASCIISum {
    private int summ(String s){
        int sum=0;
        for(char ch:s.toCharArray()){
            int maxx= Integer.MIN_VALUE;
            int asc=0;
            if(Character.isDigit(ch))asc=ch-'0';
            else asc=ch;
            while(asc!=0 ){
                maxx=Math.max(maxx,asc%10);
                asc=asc/10;
                
            }
            sum+=maxx;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="CD#34";
        ASCIISum obj=new ASCIISum();
        System.out.println(obj.summ(s));
    }
}
