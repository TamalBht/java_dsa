import java.lang.Math;
import java.util.Scanner;


public class BitOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        int count=0;
        int initBit=0;
        while(inp/2>0){
            int bit=inp%2;
            initBit=initBit+bit*(int)(Math.pow(10,count));
            count++;
            inp=inp/2;
            if(inp==1){
                initBit=initBit+(int)(Math.pow(10,count));
                break;
            }
        }
        System.out.println(initBit);
        int finalRes=0;
        String s=Integer.toString(initBit);
        
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i)-'0';
            if(temp==1)temp=0;
            else temp=1;
            temp=(int)(temp*Math.pow(2,s.length()-i-1));
            finalRes=temp+finalRes;
        }
        System.out.println(finalRes);        
    }
}
