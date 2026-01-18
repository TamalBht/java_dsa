import java.util.*;
import java.lang.*;
import java.io.*;
public class CountReversePairs {
    public int ms(int low,int high,int nums[]){
        if(low<high){
            int mid=(low+high)/2;
            ms(low,mid,nums);
            ms(mid+1,high,nums);
           int cnt= merge(low,mid,high,nums)
           return cnt;
        }
        return 0;
    }

//bruteforce methods
    public int reversePairs(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=n-1;
            while(i<j){
                 long a=(long)nums[i];
                 long b=(long)nums[j];
                if(a>2*b)count++;
                j--;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        }
        CountReversePairs obj=new CountReversePairs();
        int res=obj.reversePairs(nums);
        System.out.print(res);
    }
}
