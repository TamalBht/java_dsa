package string;

import java.util.Scanner;

public class MaxDepth {
    public int maxDepth(String s) {
        int count=0,maxCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')count++;
            else if(s.charAt(i)==')'){
                maxCount=Math.max(count,maxCount);
                //from here continuing means that 1 layer is already present
                count--;
            }
        }
            
        return maxCount;

        }

    

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        MaxDepth obj=new MaxDepth();
        int res=obj.maxDepth(str);
        System.out.print(res);
        
    }
}
