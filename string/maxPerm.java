package string;

import java.util.*;
import java.lang.*;

public class maxPerm {
    int checkk(String[] sts){
        int maxx=0;
        for(int i=0;i<sts.length;i++){
            int vowCount=0;
            int len=sts[i].length();
            for(int j=0;j<len;j++){
                if(sts[i].charAt(j)=='a' || sts[i].charAt(j)=='e' || sts[i].charAt(j)=='i' || sts[i].charAt(j)=='o' || sts[i].charAt(j)=='u'){
                    vowCount++;
                }
            }
            len=len-vowCount;
             maxx=Math.max(maxx, len);
        }
        if(maxx==0)return maxx;
        int pro=1;
        for(int i=1;i<=maxx;i++){
            pro*=i;
        }
        return pro;
       

    }

    public static void main(String[] chars){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s= new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        maxPerm obj=new maxPerm();
        int res=obj.checkk(s);
        System.out.print(res);
        
    }
}
