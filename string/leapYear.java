package string;
import java.util.*;
import java.io.*;
public class leapYear {
    boolean checkLeap(int n){
        if(n<0)return false;
        boolean b= (n%4==0) && (n%100!=0 || n%400==0);
        return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        leapYear obj=new leapYear();
        if(obj.checkLeap(n))System.out.println("Leap year");
        else System.out.println("Not leap year");
    }
}
