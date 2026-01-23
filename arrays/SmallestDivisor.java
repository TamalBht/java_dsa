import java.util.*;
import java.lang.*;
import java.io.*;

//find the smallest number fro which the ceil sum of each elemn of an array after being divided by that number gives that sum
public class SmallestDivisor {
    public int calcSum(int[]nums,int div){
        int sum=0;
        for(int num:nums){
            sum+=(int)Math.ceil((double)num/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums,int threshold){
        int maxx=Arrays.stream(nums).max().getAsInt();
        for(int i=1;i<maxx;i++){
            int res=calcSum(nums,i);
            if(res<=threshold)return i;
        }
        return maxx;
    }
    public int smallestDivisor_opt(int[] nums,int threshold){
        int maxx=Arrays.stream(nums).max().getAsInt();
        int start=1,end=maxx;
        int ans=maxx;
        while(start<=end){
            int mid=(start+end)/2;
            int res=calcSum(nums, mid);
            if(res<=threshold){
                //update the answer and move towards higheer range to get more accuracy
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={44,22,33,11,1};
        int t=5;
        SmallestDivisor obj=new SmallestDivisor();
        int res=obj.smallestDivisor_opt(nums, t);
        System.out.println(res);
    }
}
