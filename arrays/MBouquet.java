import java.util.*;
import java.lang.*;
import java.io.*;

public class MBouquet {
    public int bouquetNum(int[] bloomDay,int days,int k){
        int count=0;
        int ans=0;
        int n=bloomDay.length;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=days){
                count++;
                if(count==k){
                    ans++;
                    count=0;
                } 

            }else{
                count=0;
            }
            
        }
        
        return ans;

    }
    public int minDays(int[] bloomDay,int m,int k){
        int n=bloomDay.length;
        
        int res=Integer.MAX_VALUE;
        int minDays=Arrays.stream(bloomDay).min().getAsInt();
        int maxDays=Arrays.stream(bloomDay).max().getAsInt();
        for(int i=minDays;i<=maxDays;i++){
            int bNum=bouquetNum(bloomDay, i, k);
            
            if(bNum==m)return i; 
        }
        return -1;
    }
    public int minDays_opt(int[] bloomDay,int m,int k){
        int start=Arrays.stream(bloomDay).min().getAsInt();
        int end=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            int nB=bouquetNum(bloomDay, mid, k);
            
             if(nB>=m){
                ans=mid;
                end=mid-1;
             }
            else start=mid+1;
        }
        return  ans;
    }
    public static void main(String[] args) {
        int[] bloomDays = {1,10,3,10,2};
        int k = 1;
        int m = 3;

        MBouquet obj=new MBouquet();
        int result =obj.minDays_opt(bloomDays, m, k);

        
        
            System.out.println("We can make bouquets on day " + result);
    }
}
