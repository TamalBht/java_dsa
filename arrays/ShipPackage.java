import java.util.*;
import java.lang.*;
import java.io.*;
public class ShipPackage {
    public int daysCount(int[] weights,int target){
        int count=0;
        int summ=0;
        for(int w:weights){
            
            if(summ+w>target){
                count++;
                summ=w;
            }else{
                summ+=w;
            }

        }
         if(summ > 0) count++; 
        return count;
    }
    public int shipWithinDays(int[] weights,int days){
        int range_max=Arrays.stream(weights).sum();
        for(int i=1;i<range_max;i++){
            int daynum=daysCount(weights, i);
            if(daynum<=days)return i;
        }
        return range_max;
    }
     public int shipWithinDays_opt(int[] weights,int days){
        int range_max=Arrays.stream(weights).sum();
        int ans=range_max;
        int end=range_max;
        int start=Arrays.stream(weights).max().getAsInt();
        while(start<=end){
            int mid=(start+end)/2;
            int dnum=daysCount(weights, mid);
            if(dnum<=days){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
           
        }
         return ans;
    }
    
    public static void main(String[] args) {
        int[] w={1,2,3,4,5,6,7,8,9,10};
        int d=5;
        ShipPackage obj=new ShipPackage();
        int res=obj.shipWithinDays_opt(w, d);
        System.out.println(res);
    }
}
