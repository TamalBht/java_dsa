import java.util.*;
import java.lang.*;
import java.io.*;
//find the maximum product of subbarray

public class MaxProdSub {
    public int maxProdBrute(int[] nums){
        int res=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            for(int j=i+1;j<n;j++){
                temp=Math.max(temp,temp*nums[j]);
            }
            res=Math.max(res,temp);
        }
        return res;

    }
    public int maxProduct_opt(int[] nums){
        int n=nums.length;
        int pref=1,suff=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pref==0)pref=1;
            if(suff==0)suff=1;
            pref*=nums[i];
            suff*=nums[n-i-1];
            //incase we encounter with 0
            
            ans=Math.max(ans,Math.max(pref, suff));

        }
        return ans;

    }
    
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(args[i+1]);
        }
        MaxProdSub obj= new MaxProdSub();
        int res=obj.maxProduct_opt(nums);
        System.out.print(res);
    }
}
